package a3_maq_vendas_final.banco;

import a3_maq_vendas_final.classes.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Banco {

    public boolean ValidarSenha(String usu, String pass) {

        String usuario = usu;
        String senha = "0";

        String sql = "SELECT senha FROM a3.admins WHERE usuario = ?";

        DAO dao = new DAO();
        try ( Connection c = dao.obtemConexao()) {

            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, usuario);

            ResultSet rs = ps.executeQuery();
            //5: itera sobre o resultado
            String aux = "";
            while (rs.next()) {
                senha = rs.getString("senha");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (senha.equals(pass)) {
            return (true);
        } else {
            return (false);
        }
    }

    public void Insert(String nome, int qtd, Double preco_compra, Double preco_venda) throws SQLException {
        //Comando SQL
        String sql = "INSERT INTO a3.produtos(nome_produto,qtd_estoque,qtd_vendida,preco_compra,preco_venda) VALUES(?,?,0,?,?)";
        // Abrir conexão
        DAO factory = new DAO();
        try ( Connection con = factory.obtemConexao()) {
            PreparedStatement ps = con.prepareStatement(sql);//pré compilação de informações

            ps.setString(1, nome);
            ps.setInt(2, qtd);
            ps.setDouble(3, preco_compra);
            ps.setDouble(4, preco_venda);
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void Update(String nome, int qtd, Double preco_compra, Double preco_venda, int id) throws SQLException {
        String sql = "Update produtos set nome_produto = ?,qtd_estoque = ?,preco_compra = ?,preco_venda = ? WHERE id_produto = " + id;

        DAO factory = new DAO();
        try ( Connection con = factory.obtemConexao()) {
            PreparedStatement ps = con.prepareStatement(sql);//pré compilação de informações

            ps.setString(1, nome);
            ps.setInt(2, qtd);
            ps.setDouble(3, preco_compra);
            ps.setDouble(4, preco_venda);
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void Delete(int id) throws SQLException {
        String sql = "Delete from produtos where id_produto = " + id;

        DAO factory = new DAO();
        try ( Connection con = factory.obtemConexao()) {
            PreparedStatement ps = con.prepareStatement(sql);//pré compilação de informações
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Produto Read(int id) throws SQLException {
        String sql = "SELECT * FROM a3.produtos WHERE id_produto = " + id;

        DAO factory = new DAO();
        try ( Connection con = factory.obtemConexao()) {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Produto resposta = new Produto(-1, "", 0, 0.0, 0.0);
            while (rs.next()) {
                resposta.setId(Integer.parseInt(rs.getString(1)));
                resposta.setNome(rs.getString(2));
                resposta.setQuantidade_disponivel(Integer.parseInt(rs.getString(3)));
                resposta.setQuantidade_vendida(Integer.parseInt(rs.getString(4)));
                resposta.setPreco_compra(Double.parseDouble(rs.getString(5)));
                resposta.setPreco_venda(Double.parseDouble(rs.getString(6)));
            }
            return (resposta);
        } catch (Exception ex) {
            Produto resposta = new Produto(-1, "FALHA", 0, 0.0, 0.0);
            ex.printStackTrace();
            return (resposta);
        }

    }

    public int Count() throws SQLException {
        String sql = "SELECT Count(id_produto) AS total FROM a3.produtos";
        DAO factory = new DAO();
        int tamanho = 0;
        try ( Connection con = factory.obtemConexao()) {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                tamanho = (Integer.parseInt(rs.getString(1)));
            }
            return tamanho;
        } catch (Exception ex) {
            ex.printStackTrace();
            return (tamanho);
        }
    }

    public String[][] Read_all() throws SQLException {
        String sql = "SELECT * FROM a3.produtos";
        DAO factory = new DAO();
        String[][] res = new String[Count()][6];
        try ( Connection con = factory.obtemConexao()) {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while (rs.next()) {
                res[i][0] = rs.getString(1);
                res[i][1] = rs.getString(2);
                res[i][2] = rs.getString(3);
                res[i][3] = rs.getString(4);
                res[i][4] = rs.getString(5);
                res[i][5] = rs.getString(6);
                i++;
            }
            return res;
        } catch (Exception ex) {
            ex.printStackTrace();
            return (res);
        }
    }

    public void venda(String nome,int qestoque,int qvendida,Double pcompra,Double pvenda,int id) {
        String sql = "Update produtos set nome_produto = ?,qtd_estoque = ?,qtd_vendida = ?,preco_compra = ?,preco_venda = ? WHERE id_produto = ?";

        DAO factory = new DAO();
        try ( Connection con = factory.obtemConexao()) {
            PreparedStatement ps = con.prepareStatement(sql);//pré compilação de informações

            ps.setString(1, nome);
            ps.setInt(2, qestoque);
            ps.setInt(3, qvendida);
            ps.setDouble(4, pcompra);
            ps.setDouble(5, pvenda);
            ps.setInt(6, id);
            ps.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
