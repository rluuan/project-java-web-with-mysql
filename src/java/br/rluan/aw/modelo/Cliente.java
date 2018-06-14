// Nome do pacote
package br.rluan.aw.modelo;
 
// Importações
// JavaBeans costumam implementar Serializable
// Date utilizado para lidar com data de nascimento
import java.io.Serializable;
 
// Definição da classe
public class Cliente implements Serializable {
 
  // Um atributo para cada campo da tabela Cliente
  private String name;
  private String email;
  private String pass;
  
  private String modelo;
  private String ano;
  private String cor;
  private String marca;
  private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
  
  public Cliente() {
  }
 
  // Segundo método construtor, com todos os argumentos
  public Cliente(String modelo, String marca, String ano, String cor) {
      this.modelo = modelo;
      this.marca = marca;
      this.ano = ano;
      this.cor = cor;
  }
public Cliente(String modelo, String marca, String ano, String cor,int id) {
      this.modelo = modelo;
      this.marca = marca;
      this.ano = ano;
      this.cor = cor;
      this.id = id;
  }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

  

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
  
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}