<%-- 
    Document   : relatorio
    Created on : 13/06/2018, 17:49:11
    Author     : trunks
--%>
<%@page import="br.rluan.aw.dados.DadosGerais"%>
<%@page import="java.util.List"%>
<%@page import="br.rluan.aw.modelo.ClienteDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.rluan.aw.modelo.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% DadosGerais dadosSite = new DadosGerais(); %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    


    <title><% out.print(dadosSite.getNomeSite()); %>! | </title>

    <!-- Bootstrap -->
    <link href="vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="vendors/nprogress/nprogress.css" rel="stylesheet">
    <!-- iCheck -->
   <link href="vendors/iCheck/skins/flat/green.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="build/css/custom.min.css" rel="stylesheet">
    
    <link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css" />

  </head>
  
  <body class="nav-md">
    <div class="container body">
      <div class="main_container">
        <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="index.html" class="site_title"><i class="fa fa-paw"></i> <span><% out.print(dadosSite.getNomeSite()); %>!</span></a>
            </div>

            <div class="clearfix"></div>

       
            <!-- /menu profile quick info -->

            <br />

            <!-- sidebar menu -->
            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section">
                <h3>General</h3>
                <ul class="nav side-menu">
                  <li><a><i class="fa fa-home"></i> Home <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="#">Dashboard</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-edit"></i> Product <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="form.html">Cadastro</a></li>
                    </ul>
                  </li>
                  
                </ul>
              </div>

            </div>
            <!-- /sidebar menu -->

            <!-- /menu footer buttons -->
          
            <!-- /menu footer buttons -->
          </div>
        </div>

        <!-- top navigation -->
       
        <!-- /top navigation -->

        <!-- page content -->
        <div class="right_col" role="main">
          <div class="">
            <div class="page-title">
              <div class="title_left">
                <h3>Relat&oacute;rio <small>Veja os ultimos relat&oacute;rios</small></h3>
              </div>

            </div>

            <div class="clearfix"></div>

            <div class="row">
                <table class="table" id="table_id">
                    <thead>
                        <tr>
                            <th> Modelo </th>
                            <th> Marca </th>
                            <th> Ano </th>
                            <th> Cor </th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                           ClienteDAO todosProdutos = new ClienteDAO();
                           
                           List<Cliente> listaProdutos = todosProdutos.todosClientes();
                        %>
                        <% for (int i = 0; i < (int) listaProdutos.size(); ++i) { %>
                        <tr>
                            <td> <% out.print(listaProdutos.get(i).getModelo()); %> </td>
                            <td> <% out.print(listaProdutos.get(i).getMarca()); %> </td>
                            <td> <% out.print(listaProdutos.get(i).getAno()); %> </td>
                            <td> <% out.print(listaProdutos.get(i).getCor()); %> </td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
            </div>
          </div>
        </div>
        <!-- /page content -->

        <!-- footer content -->
        <footer>
          <div class="pull-right">
            Gentelella - Bootstrap Admin Template by <a href="https://colorlib.com">Colorlib</a>
          </div>
          <div class="clearfix"></div>
        </footer>
        <!-- /footer content -->
      </div>
    </div>

    <!-- jQuery -->
    <script src="vendors/jquery/dist/jquery.min.js"></script>
    <script src="//cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
    <!-- Bootstrap -->
    <script src="vendors/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="vendors/fastclick/lib/fastclick.js"></script>
    <!-- NProgress -->
    <script src="vendors/nprogress/nprogress.js"></script>
    <!-- iCheck -->
    <script src="vendors/iCheck/icheck.min.js"></script>

    <!-- Custom Theme Scripts -->
    <script src="build/js/custom.min.js"></script>
    <script>
      $(document).ready( function () {
    $('#table_id').DataTable();
} );

</script>
  </body>
</html>
