
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addProduct_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

     object addProduct_Scope1 {
import helper._

class addProduct extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.Product],models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(addProductForm: Form[models.Product])(user: models.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.59*/("""


    """),_display_(/*5.6*/main("AddProduct", user)/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""

        """),format.raw/*7.9*/("""<div class="container">
            <h2 class = "text-center text-muted">Add A Product To <span class = "logo">Sourced Soles</span></h2>

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
                    <input class = "btn btn-danger" type = "file" name = "upload">

                    <br>

                    <div class="actions">
                        <input type="submit" value="Add Product" class="btn btn-danger">


                        """),format.raw/*42.131*/("""
                        """),format.raw/*43.25*/("""<a href=""""),_display_(/*43.35*/routes/*43.41*/.HomeController.products()),format.raw/*43.67*/("""" class="btn btn-warning">Cancel</a>


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


}
}

/**/
object addProduct extends addProduct_Scope0.addProduct_Scope1.addProduct
              /*
                  -- GENERATED --
                  DATE: Fri Feb 22 14:31:53 GMT 2019
                  SOURCE: /home/wdd/IanDaly-sourcedsoles-d991719c7913/app/views/addProduct.scala.html
                  HASH: 40d92bd2f723210ce48a4f3440273b593d551da3
                  MATRIX: 830->18|982->75|1015->83|1047->107|1086->109|1122->119|1418->388|1564->524|1605->526|1655->549|1750->623|1799->645|1899->723|1948->745|2050->825|2099->847|2199->925|2248->947|2350->1027|2399->1049|2501->1129|2551->1152|2639->1219|2689->1242|3008->1540|3058->1562|3382->1963|3435->1988|3472->1998|3487->2004|3534->2030|3693->2159
                  LINES: 30->2|35->2|38->5|38->5|38->5|40->7|48->15|48->15|48->15|50->17|50->17|51->18|51->18|52->19|52->19|53->20|53->20|54->21|54->21|55->22|55->22|57->24|57->24|59->26|64->31|66->33|75->42|76->43|76->43|76->43|76->43|84->51
                  -- GENERATED --
              */
          