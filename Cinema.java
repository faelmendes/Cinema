
public class Cinema{
	Cliente[] cadeira;
        boolean teste = false;
        
	public String criar(int numero){
            cadeira = new Cliente[numero];
            teste = true;
            return "sucesso";
         }


	public String reservar(String id, String fone, int posicao){
            if(teste){
                    if (posicao > cadeira.length-1) {
        		       return "O cinema nao possui esse numero de cadeiras, lembrete comessando do zero";
        		    }
                    
                    for(int i = 0; i < cadeira.length;i++){
                         if(cadeira[i] != null){
                            if(cadeira[i].id.equals(id)){
                               return "failure: cliente ja esta no cinema";
                            }
                         }
                    }
                    
                    if(cadeira[posicao] == null){
                     Cliente pessoa = new Cliente(id,fone);
                     cadeira[posicao]= pessoa;
                     return "success";
                    
                      }else{
                         return "failure: cadeira ja esta ocupada";
                    }   

            }else{
                return "failure: o cinema nao foi criado";
            } 
        }
        
        
        public String cancelar(String id){
            if(teste){
                for (int i = 0;i < cadeira.length ;i++ ) {
                     if(cadeira[i] != null){
                        if(cadeira[i].id.equals(id)){
                            cadeira[i] = null;
                            return "success";
                        } 
                            
                        }
                     }
                       
                         
                return "failure: cliente nao esta no cinema";  

           }else{
             return "failure: o cinema nao foi criado";
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
