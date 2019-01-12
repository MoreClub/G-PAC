 class Result{
    private Unit[] rawGPACs = 0;
    private int gpaFinal = 0;
    private String rank = ' ';
  public Result(Unit[] GPACs) {
    rawGPACs = GPACs;
  }

  public double getGPA(){
    int credit = 0;
    int total = 0;
    for (int count = 0; count < rawGPACs.length; count++) {
      if (rawGPACs[count].getScore() != 0) {
        credit += (Double)(this.rawGPACs[count].getCredit());//Import Credit
        total += rawGPACs[count].getGPA();//Adds all the raw GPA
      }
    }

    gpaFinal = Math.round(total / credit);
    return gpaFinal;

  }

  getRank(){
    if (gpaFinal <= 3) { rank = " Try harder!"; }
    else if (gpaFinal >= 3) { rank = " Sweet!"; }
    else { rank = "Error!"; }

    return rank;
  }

}

class Unit{
    private String rawLevel = "S";
    private String rawName, rawCredit,rawTypename = ' ';
    private int rawScore,rawIdentifier = 0;
    private boolean rawType = true;
    private Double[] NLAPList = {0, 2.6, 3.0, 3.3, 3.6, 3.9, 4.2, 4.5}; //Credits for Language AP IN ORDER
    private Double[] NLHPLUSList = {0, 2.25, 2.65, 2.95, 3.25, 3.55, 3.85, 4.15}; //Credits for Language S+ IN ORDER
    private Double[] NLHList= {0, 2.4, 2.8, 3.1, 3.4, 3.7, 4.0, 4.3}; //Credits for NonLanguage H IN ORDER
    private Double[] NLSPLUSList= {0, 2.25, 2.65, 2.95, 3.25, 3.55, 3.85, 4.15}; //Credits for NonLanguage S+ IN ORDER
    private Double[] NLSList= {0, 2.1, 2.5, 2.8, 3.1, 3.4, 3.7, 4.0}; //Credits for NonLanguage S IN ORDER
    private Double[] LAPList= {0, 2.6, 3.0, 3.3, 3.6, 3.9, 4.2, 4.5}; //Credits for Language AP IN ORDER
    private Double[] LHPLUSList= {0, 2.5, 2.9, 3.2, 3.5, 3.8, 4.1, 4.4}; //Credits for Language H+ IN ORDER
    private Double[] LHList= {0, 2.4, 2.8, 3.1, 3.4, 3.7, 4.0, 4.3}; //Credits for Language H IN ORDER
    private Double[] LSPLUSList= {0, 2.2, 2.6, 2.9, 3.2, 3.5, 3.8, 4.1}; //Credits for Language S+ IN ORDER
    private Double[] LSList= {0, 2.1, 2.5, 2.8, 3.1, 3.4, 3.7, 4.0}; //Credits for Language S IN ORDER

  public Unit(String name, Double credit, int type) {
    rawName = name;
    rawCredit = credit;
    rawIdentifier = type;
    rawScore = 0;
    convertType(rawIdentifier);
    
  }

  private void convertType(int type){
    if (rawIdentifier == 0){ //0 is Non-Language, 1 is Language
      rawType = false;
      rawTypename = "Non-Language";
    }
    else{
      rawType = true;
      rawTypename = "Language";
    }
  }

  public void setCredit(Double credit){
    rawCredit = credit;
  }

  public void setType(boolean type){
    rawType = type;
  }

  public void setScore(int score){
    rawScore = score;
  }

  public void setLevel(String level) {
    rawLevel = level;
  }

  public String getLevel() {
    return rawLevel;
  }

  public int getScore(){
    return this.rawScore;
  }

  public Double getCredit() {
    return this.rawCredit;
  }

  public boolean getType() {
    return this.rawType;
  } 

  //Data Importation Function
  public Double getGPA(){
    if (this.rawType == true) {  //false is non-language, true is language
    return this.rawCredit * this.getL();
    }
    else{
    return this.rawCredit * this.getNL();
    }
  }

   //Subject Categorization Function
   getNL() {
    //console.log(Level);
      if (this.rawLevel == "AP") {
      return this.calGPA(this.NLAPList);
    }
      if (this.rawLevel == "H+") {
      return this.calGPA(this.NLHPLUSList);
      
    }
      if (this.rawLevel == "H") {
      return this.calGPA(this.NLHList);

    }
      if (this.rawLevel == "S+") {
      return this.calGPA(this.NLSPLUSList);

    }
      if (this.rawLevel == "S") {
      return this.calGPA(this.NLSList);
    }

  }

  getL() {
    //console.log(Level);
    if (this.rawLevel == "AP") {
      return this.calGPA(this.LAPList);
    }
    if (this.rawLevel == "H+") {
      return this.calGPA(this.LHPLUSList);

    }
    if (this.rawLevel == "H") {
      return this.calGPA(this.LHList);

    }
    if (this.rawLevel == "S+") {
      return this.calGPA(this.LSPLUSList);

    }
    if (this.rawLevel == "S") {
      return this.calGPA(this.LSList);
    }

  }

  calGPA(Double[] list){
    //console.log(list);
    //console.log(listname);
    //console.log(this.data.[listname])
    //console.log("AP",Score)
    if (this.rawScore <= 59)
      this.gpa = list[0];
    if (this.rawScore > 59 && this.rawScore <= 67)
      this.gpa = list[1];
    if (this.rawScore > 67 && this.rawScore <= 72)
      this.gpa = list[2];
    if (this.rawScore > 72 && this.rawScore <= 77)
      this.gpa = list[3];
    if (this.rawScore > 77 && this.rawScore <= 82)
      this.gpa = list[4];
    if (this.rawScore > 82 && this.rawScore <= 87)
      this.gpa = list[5];
    if (this.rawScore > 87 && this.rawScore <= 92)
      this.gpa = list[6];
    if (this.rawScore > 92 && this.rawScore <= 100)
      this.gpa = list[7];
    //console.log(gpa)
    return this.gpa;
  }

  toString() {
      return ("Subject Name: " + this.rawName + " Subject Credit: " + this.rawCredit + " Subject Type: " + this.rawTypename + " Subject Score: " + this.rawScore + " Subject Level: " + this.rawLevel);
  }

}
