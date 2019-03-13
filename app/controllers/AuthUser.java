package controllers;

import play.mvc.*;

import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import models.*;

import javax.annotation.processing.Completion;


public class AuthUser extends Action.Simple {

    public CompletionStage<Result> call(Http.Context ctx) {

        // Check if current user (in session) is an admin
        String id = ctx.session().get("email");
        if (id != null) {
            User u = User.getUserById(id);
            if ("customer".equals(u.getRole())) {

                // User admin sp continue with the http request
                return delegate.call(ctx);
            }
        }
        //Result unauthorized = Results.unauthorized("unauthorized");
        // Unauthorised - redirect to login page
        ctx.flash().put("error", "Login Required.");
        return CompletableFuture.completedFuture(redirect(routes.LoginController.login()));
    }
}
