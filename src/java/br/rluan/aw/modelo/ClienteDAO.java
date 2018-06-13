// Definição do pacote
package br.rluan.aw.modelo;
 
// Importações
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
 
// Declaração da classe
public class ClienteDAO {
 
  // Quatro variáveis finais para conexão com banco de dados
  private static final String DRIVER = "com.mysql.jdbc.Driver";
  private static final String URL = "jdbc:mysql://localhost:3306/av1";
  private static final String USUARIO = "root";
  private static final String SENHA = "12345";
  // Variáveis finais com instruções SQL
  private static final String sqlSelecao = "SELECT * FROM produtos ORDER BY modelo";
  private static final String sqlInclusao = "insert into produtos(modelo, marca, cor) values (?, ?, ?)";
  // Objetos para conexão com banco de dados
  private static Connection conexao;
  private static PreparedStatement ps;
  private static ResultSet rs;
  public static int estado;
 
  // Método para retornar todos os registros
  public static List<Cliente> todosClientes() {
    // Cria um List nulo
    List<Cliente> lista = null;
    // Conectar com o banco de dados
    if (conectar()) {
      // Se conectado
      try {
        // Obtém registros
        ps = conexao.prepareStatement(sqlSelecao);
        rs = ps.executeQuery();
        // Cria List
        lista = new ArrayList<Cliente>();
        // Navega entre registros
        while (rs.next()) {
          // Cria objeto a partir do registro
          Cliente cliente = popularCliente();
          // Adicionar objeto à List
          lista.add(cliente);
        }
      } catch (SQLException sqle) {
        System.out.println(sqle.getLocalizedMessage());
      } finally {
        // Desconectar
        desconectar();
      }
    }
    // Retorna a List
    return lista;
  }
 public static boolean inserirCliente(Cliente cliente) {
    boolean retorno = false;
    if (conectar()) {
      try {
        ps = conexao.prepareStatement(sqlInclusao);
        ps.setString(1, cliente.getModelo());
        ps.setString(2, cliente.getMarca());
        ps.setString(3, cliente.getCor());
        ps.execute();
        retorno = true;
      } catch (SQLException sqle) {
      } finally {
        desconectar();
      }
    }
    return retorno;
  }
  // Método que realiza conexão ao banco de dados
  // Retorna 'true' se conectado
  public static boolean conectar() {
    try {
        
      Class.forName(DRIVER);
      conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        System.out.println("1");
    } catch (ClassNotFoundException cnfe) {
      System.out.println(cnfe.getLocalizedMessage());
      System.out.println("2");
    } catch (SQLException sqle) {
      System.out.println(sqle.getLocalizedMessage());
      estado = 3;
    } finally {
      return (conexao != null);
    }
  }
 
  // Método que realiza desconexão ao banco de dados
  public static void desconectar() {
    if (conexao != null) {
      try {
        conexao.close();
      } catch (SQLException sqle) {
        System.out.println(sqle.getLocalizedMessage());
      }
    }
  }
 
  // Método que cria um objeto a partir de um registro
  private static Cliente popularCliente() throws SQLException {
    String modelo = rs.getString("modelo");
    String marca = rs.getString("marca");
    String cor = rs.getString("cor");
    String ano = rs.getString("ano");
    Cliente cliente = new Cliente(modelo, marca, ano, cor);
    return cliente;
  }
}
