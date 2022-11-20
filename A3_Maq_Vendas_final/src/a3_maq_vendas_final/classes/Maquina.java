package a3_maq_vendas_final.classes;

import javax.swing.JOptionPane;

public class Maquina {
    private Produto pos1;
    private Produto pos2;
    private Produto pos3;
    private Produto pos4;
    private Produto pos5;
    private Produto pos6;
    private Produto pos7;
    private Produto pos8;
    private Produto pos9;
    private boolean trava_porta;
    
    public Maquina ( Produto pos1,Produto pos2,Produto pos3,Produto pos4,Produto pos5,Produto pos6,Produto pos7,Produto pos8,Produto pos9){
        this.pos1 = pos1;
        this.pos2 = pos2;
        this.pos3 = pos3;
        this.pos4 = pos4;
        this.pos5 = pos5;
        this.pos6 = pos6;
        this.pos7 = pos7;
        this.pos8 = pos8;
        this.pos9 = pos9;
        this.trava_porta = true;
    }
            
    // Getters e Setters
    public void setPos1 (Produto prod){
        if (this.getPos1().getQuantidade_disponivel()==0){
            this.pos1 = prod;   
        }
        else{
            JOptionPane.showMessageDialog(null,"A posicao ja esta preenchida.");
        }
    } 
    public void setPos2 (Produto prod){
        if (this.getPos2().getQuantidade_disponivel()==0){
            this.pos2 = prod;   
        }
        else{
            JOptionPane.showMessageDialog(null,"A posicao ja esta preenchida.");
        }
    } 
    public void setPos3 (Produto prod){
        if (this.getPos3().getQuantidade_disponivel()==0){
            this.pos3 = prod;   
        }
        else{
            JOptionPane.showMessageDialog(null,"A posicao ja esta preenchida.");
        }
    } 
    public void setPos4 (Produto prod){
        if (this.getPos4().getQuantidade_disponivel()==0){
            this.pos4 = prod;   
        }
        else{
            JOptionPane.showMessageDialog(null,"A posicao ja esta preenchida.");
        }
    } 
    public void setPos5 (Produto prod){
        if (this.getPos5().getQuantidade_disponivel()==0){
            this.pos5 = prod;   
        }
        else{
            JOptionPane.showMessageDialog(null,"A posicao ja esta preenchida.");
        }
    } 
    public void setPos6 (Produto prod){
        if (this.getPos6().getQuantidade_disponivel()==0){
            this.pos6 = prod;   
        }
        else{
            JOptionPane.showMessageDialog(null,"A posicao ja esta preenchida.");
        }
    } 
    public void setPos7 (Produto prod){
        if (this.getPos7().getQuantidade_disponivel()==0){
            this.pos7 = prod;   
        }
        else{
            JOptionPane.showMessageDialog(null,"A posicao ja esta preenchida.");
        }
    } 
    public void setPos8 (Produto prod){
        if (this.getPos8().getQuantidade_disponivel()==0){
            this.pos8 = prod;   
        }
        else{
            JOptionPane.showMessageDialog(null,"A posicao ja esta preenchida.");
        }
    } 
    public void setPos9 (Produto prod){
        if (this.getPos9().getQuantidade_disponivel()==0){
            this.pos9 = prod;   
        }
        else{
            JOptionPane.showMessageDialog(null,"A posicao ja esta preenchida.");
        }
    } 
    
    public Produto getPos1() {
        return pos1;
    }
    public Produto getPos2() {
        return pos2;
    }
    public Produto getPos3() {
        return pos3;
    }
    public Produto getPos4() {
        return pos4;
    }
    public Produto getPos5() {
        return pos5;
    }
    public Produto getPos6() {
        return pos6;
    }
    public Produto getPos7() {
        return pos7;
    }
    public Produto getPos8() {
        return pos8;
    }
    public Produto getPos9() {
        return pos9;
    }

    public boolean isTrava_porta() {
        return trava_porta;
    }
  
    public void setTrava_porta(boolean trava_porta) {
        this.trava_porta = trava_porta;
    }
}

