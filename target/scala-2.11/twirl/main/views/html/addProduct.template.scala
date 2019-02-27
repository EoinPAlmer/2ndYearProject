
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


}
}

/**/
object addProduct extends addProduct_Scope0.addProduct_Scope1.addProduct
              /*
                  -- GENERATED --
                  DATE: Wed Feb 27 16:51:43 GMT 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/addProduct.scala.html
                  HASH: 963f49fd1af0e897ba5de4233af3532e1a75db20
                  MATRIX: 830->18|982->75|1015->83|1047->107|1086->109|1122->119|1422->392|1568->528|1609->530|1659->553|1754->627|1803->649|1903->727|1952->749|2054->829|2103->851|2203->929|2252->951|2354->1031|2403->1053|2505->1133|2555->1156|2643->1223|2693->1246|3012->1544|3062->1566|3382->1963|3435->1988|3472->1998|3487->2004|3534->2030|3692->2158
                  LINES: 30->2|35->2|38->5|38->5|38->5|40->7|48->15|48->15|48->15|50->17|50->17|51->18|51->18|52->19|52->19|53->20|53->20|54->21|54->21|55->22|55->22|57->24|57->24|59->26|64->31|66->33|75->42|76->43|76->43|76->43|76->43|84->51
                  -- GENERATED --
              */
          