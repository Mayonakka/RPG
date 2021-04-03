public abstract class Personagem {
  
  private final String nome;
  private int vida;
  private final int maxVida;
  private int dano;

  public String getNome() {
    return this.nome;
  }
  public int getVida() {
    return this.vida;
  }
  public int getMaxVida() {
    return this.maxVida;
  }
  public void setVida(int life){
    this.vida = life;
  }

  public int recebeDano(int dano){
    if(dano >= this.vida){
      setVida(0);
    }else{
      setVida(this.vida - dano);
    }
    return this.vida;
  }
  
  public int cura() {

    if(cura >= this.maxVida){
      setVida(this.maxVida);
    }else{
      setVida(this.vida + cura);
    }
    return this.vida;
  }
  
  public boolean isVivo(boolean isVivo){

    if(this.vida > 0){
      isVivo = true;
    }else{
      isVivo = false;
    }
    return isVivo;
  }
  
  @Override
  public String toString(){
    return this.nome + " - vida:" + this.vida "/" + this.maxVida;
  }
  
  public abstract void passaTurno(){

  }

  public abstract void ataca(){

  }
  
}