
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import helper._

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Product],models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(addProductForm: Form[models.Product])(user: models.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""

    """),_display_(/*5.6*/main("AddProduct", user)/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""

        """),format.raw/*7.9*/("""<div class="container">
            <h2 class = "text-center text-muted">Add A Product To <span class = "logo">Sneaker Sanctuary</span></h2>

            <div class="row">

                <div class="col-lg-8 col-md-8 col-sm-10 col-xs-12 col-centered">


                """),_display_(/*15.18*/form(action = routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form", 'enctype -> "multipart/form-data")/*15.154*/ {_display_(Seq[Any](format.raw/*15.156*/("""

                    """),_display_(/*17.22*/inputText(addProductForm("id"), '_label -> "ID", 'class -> "form-control")),format.raw/*17.96*/("""
                    """),_display_(/*18.22*/inputText(addProductForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*18.100*/("""
                    """),_display_(/*19.22*/inputText(addProductForm("brand"), '_label -> "Brand", 'class -> "form-control")),format.raw/*19.102*/("""
                    """),_display_(/*20.22*/inputText(addProductForm("size"), '_label -> "Size", 'class -> "form-control")),format.raw/*20.100*/("""
                    """),_display_(/*21.22*/inputText(addProductForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*21.102*/("""
                    """),_display_(/*22.22*/inputText(addProductForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*22.102*/("""

                    """),_display_(/*24.22*/inputText(addProductForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*24.89*/("""

                    """),_display_(/*26.22*/select(
                        addProductForm("category.id"),
                        options(Category.options),
                        '_label -> "Category", '_default -> "-- Choose A Category--",
                        '_showConstraints -> false, 'class -> "form-control"
                    )),format.raw/*31.22*/("""

                    """),format.raw/*33.21*/("""<label>Image Upload</label>
                    <input class = "btn btn-dark" type = "file" name = "upload">

                    <br>

                    <div class="actions">
                        <input type="submit" value="Add Product" class="btn btn-dark">


                        """),format.raw/*42.131*/("""
                        """),format.raw/*43.25*/("""<a href=""""),_display_(/*43.35*/routes/*43.41*/.HomeController.products()),format.raw/*43.67*/("""" class="btn btn-danger">Cancel</a>


                    </div>
                </div>
            </div>
        </div>

    """)))}),format.raw/*51.6*/("""

    """)))}))
      }
    }
  }

  def render(addProductForm:Form[models.Product],user:models.User): play.twirl.api.HtmlFormat.Appendable = apply(addProductForm)(user)

  def f:((Form[models.Product]) => (models.User) => play.twirl.api.HtmlFormat.Appendable) = (addProductForm) => (user) => apply(addProductForm)(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 19 15:23:27 GMT 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/addProduct.scala.html
                  HASH: 85c130cd34a7958b5f1db60a215a0a6c106dc651
                  MATRIX: 651->1|1002->18|1153->76|1185->83|1217->107|1256->109|1292->119|1592->392|1738->528|1779->530|1829->553|1924->627|1973->649|2073->727|2122->749|2224->829|2273->851|2373->929|2422->951|2524->1031|2573->1053|2675->1133|2725->1156|2813->1223|2863->1246|3182->1544|3232->1566|3552->1963|3605->1988|3642->1998|3657->2004|3704->2030|3862->2158
                  LINES: 24->1|29->2|34->3|36->5|36->5|36->5|38->7|46->15|46->15|46->15|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|52->21|52->21|53->22|53->22|55->24|55->24|57->26|62->31|64->33|73->42|74->43|74->43|74->43|74->43|82->51
                  -- GENERATED --
              */
          