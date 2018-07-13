
package bean;

import static java.sql.JDBCType.TINYINT;
import static java.sql.Types.TINYINT;

/**
 * author Ricardo
 */
public class ClienteBean {
    private int id, frequencia ;
    private String nome, codigo_da_matricula;
    private float nota1, nota2, nota3;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
            this.id = id;
    }
    
    public int getFrequencia(){
        return frequencia;
    }
    
    public void setFrequencia(int frequencia){
        this.frequencia = frequencia;
    }
    
    public String getNome(){
        return nome;
    }
     
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public String getData(){
        return codigo_da_matricula;
    }
    
    public void setCodigo_da_Matricula(String codigo_da_matricula){
            this.codigo_da_matricula = codigo_da_matricula;
    }
    public float getNota1(){
        return nota1;
    }
    
    public void setNota1(float nota1){
        this.nota1 = nota1;
    }
        
    public float getNota2(){
        return nota2;
    }
    public void setNota2(float nota2){
        this.nota2 = nota2;
    }
    
    public float getNota3(){
        return nota3;
    }
    
    public void setNota3(float nota3){
        this.nota3 = nota3;
    }
}
