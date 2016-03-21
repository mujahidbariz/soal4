
public class Idol {
        private String nama, team;
        private int umur, penampilan, suara, attitude, nilai;
 public void setNama(String nama){
     this.nama = nama;
 }
 public String getNama(){
     return nama;
 }
 public void setTeam(String team){
     this.team = team;
 }
  public String getTeam(){
     return team;
 }
   public void setUmur(int umur){
     this.umur = umur;
 }
 public int getUmur(){
     return umur;
 }
    public void setPenampilan(int penampilan){
     this.penampilan = penampilan;
 }
 public int getPenampilan(){
     return penampilan;
 }
    public void setSuara(int suara){
     this.suara = suara;
 }
 public int getSuara(){
     return suara;
 }
    public void setAttitude(int attitude){
     this.attitude = attitude;
 }
 public int getAttitude(){
     return attitude;
 }
 public int nilai(){
     return (penampilan+suara+attitude)/3;
 }

}
