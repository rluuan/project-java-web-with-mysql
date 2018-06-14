package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.rluan.aw.dados.DadosGerais;
import java.util.List;
import br.rluan.aw.modelo.ClienteDAO;
import java.util.ArrayList;
import br.rluan.aw.modelo.Cliente;

public final class relatorio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 DadosGerais dadosSite = new DadosGerais(); 
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <!-- Meta, title, CSS, favicons, etc. -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("    <title>");
 out.print(dadosSite.getNomeSite()); 
      out.write("! | </title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"vendors/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Font Awesome -->\n");
      out.write("    <link href=\"vendors/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- NProgress -->\n");
      out.write("    <link href=\"vendors/nprogress/nprogress.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- iCheck -->\n");
      out.write("   <link href=\"vendors/iCheck/skins/flat/green.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom Theme Style -->\n");
      out.write("    <link href=\"build/css/custom.min.css\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"//cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css\" />\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("  \n");
      out.write("  <body class=\"nav-md\">\n");
      out.write("    <div class=\"container body\">\n");
      out.write("      <div class=\"main_container\">\n");
      out.write("        <div class=\"col-md-3 left_col\">\n");
      out.write("          <div class=\"left_col scroll-view\">\n");
      out.write("            <div class=\"navbar nav_title\" style=\"border: 0;\">\n");
      out.write("              <a href=\"index.jsp\" class=\"site_title\"><i class=\"fa fa-paw\"></i> <span>");
 out.print(dadosSite.getNomeSite()); 
      out.write("!</span></a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("       \n");
      out.write("            <!-- /menu profile quick info -->\n");
      out.write("\n");
      out.write("            <br />\n");
      out.write("\n");
      out.write("            <!-- sidebar menu -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu_left.html", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- /sidebar menu -->\n");
      out.write("\n");
      out.write("            <!-- /menu footer buttons -->\n");
      out.write("          \n");
      out.write("            <!-- /menu footer buttons -->\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- top navigation -->\n");
      out.write("       \n");
      out.write("        <!-- /top navigation -->\n");
      out.write("\n");
      out.write("        <!-- page content -->\n");
      out.write("        <div class=\"right_col\" role=\"main\">\n");
      out.write("          <div class=\"\">\n");
      out.write("            <div class=\"page-title\">\n");
      out.write("              <div class=\"title_left\">\n");
      out.write("                <h3>Relat&oacute;rio <small>Veja os ultimos relat&oacute;rios</small></h3>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <table class=\"dataTable no-footer table table-bordered table-striped\" id=\"table_id\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th> Modelo </th>\n");
      out.write("                            <th> Marca </th>\n");
      out.write("                            <th> Ano </th>\n");
      out.write("                            <th> Cor </th>\n");
      out.write("                            <th> Remover </th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");

                           ClienteDAO todosProdutos = new ClienteDAO();
                           
                           List<Cliente> listaProdutos = todosProdutos.todosClientes();
                        
      out.write("\n");
      out.write("                        ");
 for (int i = 0; i < (int) listaProdutos.size(); ++i) { 
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td> ");
 out.print(listaProdutos.get(i).getModelo()); 
      out.write(" </td>\n");
      out.write("                            <td> ");
 out.print(listaProdutos.get(i).getMarca()); 
      out.write(" </td>\n");
      out.write("                            <td> ");
 out.print(listaProdutos.get(i).getAno()); 
      out.write(" </td>\n");
      out.write("                            <td> ");
 out.print(listaProdutos.get(i).getCor()); 
      out.write(" </td>\n");
      out.write("                            <td>\n");
      out.write("                                <form action=\"excluirprodutowithId.do\" method=\"POST\" class=\"form-horizontal form-label-left\">\n");
      out.write("                                    <input type=\"hidden\" name=\"idvalue\" value=\"");
 out.print(listaProdutos.get(i).getId()); 
      out.write("\" />\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-danger\" value=\"Excluir\" name=\"Submit\"/>\n");
      out.write("                                </form>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- /page content -->\n");
      out.write("\n");
      out.write("        <!-- footer content -->\n");
      out.write("        <footer>\n");
      out.write("          <div class=\"pull-right\">\n");
      out.write("            Gentelella - Bootstrap Admin Template by <a href=\"https://colorlib.com\">Colorlib</a>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"clearfix\"></div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- /footer content -->\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"vendors/jquery/dist/jquery.min.js\"></script>\n");
      out.write("    <script src=\"//cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js\"></script>\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <script src=\"vendors/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- FastClick -->\n");
      out.write("    <script src=\"vendors/fastclick/lib/fastclick.js\"></script>\n");
      out.write("    <!-- NProgress -->\n");
      out.write("    <script src=\"vendors/nprogress/nprogress.js\"></script>\n");
      out.write("    <!-- iCheck -->\n");
      out.write("    <script src=\"vendors/iCheck/icheck.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom Theme Scripts -->\n");
      out.write("    <script src=\"build/js/custom.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("      $(document).ready( function () {\n");
      out.write("    $('#table_id').DataTable();\n");
      out.write("} );\n");
      out.write("function excluirProduto(id) {\n");
      out.write("    $.get(\"excluirprodutowithId.do\",{ id: id }, function( data ) {\n");
      out.write("        alert('Deletado com sucesso');\n");
      out.write("        location.reload();\n");
      out.write("    });\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
