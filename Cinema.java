
public class Cinema{
	Cliente[] cadeira;
        boolean teste = false;
        
	public String criar(int numero){
            cadeira = new Cliente[numero];
            teste = true;
            return "sucesso";
         }


	public boolean reservar(String id, String fone, int posicao){
            if(teste){
                    if (posicao > cadeira.length-1) {
        		       System.out.println("O cinema nao possui esse numero de cadeiras, lembrete comessando do zero");
        		       return false;
        		    }
                    
                    for(int i = 0; i < cadeira.length;i++){
                         if(cadeira[i] != null){
                            if(cadeira[i].id.equals(id)){
                            	System.out.println("failure: cliente ja esta no cinema");
                               return false;
                            }
                         }
                    }
                    
                    if(cadeira[posicao] == null){
                     Cliente pessoa = new Cliente(id,fone);
                     cadeira[posicao]= pessoa;
                     return true;
                    
                      }else{
                      	System.out.println("failure: cadeira ja esta ocupada");
                         return false;
                    }   

            }else{
            	System.out.println("failure: o cinema nao foi criado");
                return false;
            } 
        }
        
        
        public boolean cancelar(String id){
            if(teste){
                for (int i = 0;i < cadeira.length ;i++ ) {
                     if(cadeira[i] != null){
                        if(cadeira[i].id.equals(id)){
                            cadeira[i] = null;
                            return true;
                        } 
                            
                        }
                     }
                       
                  System.out.println( "failure: cliente nao esta no cinema");       
                return false; 

           }else{
           	 System.out.println("failure: o cinema nao foi criado");
             return false;
           }      
                  
        }
            
        
        
        
        public String toString(){
            String nome = "";
        
             for (int i = 0;i < cadeira.length ;i++ ) {
                 if(cadeira[i] != null){
                   nome+=" "+cadeira[i].id+":"+cadeira[i].fone+" "; 
                 }else{ 
                   nome+=" - ";
                     
                   }
                
        }
             
             return nome; 
             

        }    
  





}
