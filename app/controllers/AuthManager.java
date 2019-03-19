package controllers;

import play.mvc.*;

import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import models.*;

import javax.annotation.processing.Completion;

public class AuthManager extends Action.Simple {


    public CompletionStage<Result> call(Http.Context ctx) {

        String id = ctx.session().get("email");
        if (id != null) {
            User u = User.getUserById(id);
            if (u.getRole().equals("Manager")){
                return delegate.call(ctx);
            }
        }
        ctx.flash().put("error", "Manager Login Required.");
        return CompletableFuture.completedFuture(redirect(routes.HomeController.index()));
    }
}
