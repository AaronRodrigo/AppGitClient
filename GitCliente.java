/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaentornos;

/**
 *
 * @author rodduraa
 */
public class GitCliente {

    /**
     * @param args the command line arguments
     */
    public class GitClient{
        private String cliente;
        private String version;
        private String sistemOper;
        private String licencia;
        
        public GitClient(){}
        public String getCliente(){
            return cliente;
        }
        public void setcliente (String cliente) {
            this.cliente = cliente;
        }
        public String getversion() {
            return version;
        }
        public void setVersion (String version) {
        this.version = version;
        }
        
        
        public String getsistemoper () {
            return sistemOper;
        }
        public void setsistemOper (String sistemoper) {
            this. sistemOper = sistemoper;
        }
        public String setLicencia(String licencia){ 
            this.licencia = licencia;
            return null;
        }
        
    }
    
}
