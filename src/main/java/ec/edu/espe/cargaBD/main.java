/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espe.cargaBD;



/**
 *
 * @author AC
 */
public class main {
    public static void main(String[] args) throws Exception {
       leeEscribeTxt let = new leeEscribeTxt();
       mysqlMongo mymongo = new mysqlMongo();
       
        let.conectar();
        let.leerDatos();
        //let.desconectar();
        
        mymongo.conectarMysqlMongo();
    }

}
