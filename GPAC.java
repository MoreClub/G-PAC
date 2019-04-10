class Result{
  private Unit[] rawGPACs;
  private Double gpaFinal = 0.0;
  private String rank ="";
public Result(Unit[] GPACs) {
  rawGPACs = GPACs;
}

public double getGPA(){
  Double credit = 0.0;
  Double total = 0.0;
  for (int count = 0; count < rawGPACs.length; count++) {
    if (rawGPACs[count].getScore() != 0) {
      credit += (Double)(rawGPACs[count].getCredit());//Import Credit
      total += rawGPACs[count].getGPA();//Adds all the raw GPA
    }
  }

  gpaFinal =(double) Math.round(total / credit);
  return gpaFinal;

}

public String getRank(){
  if (gpaFinal <= 3) { rank = " Try harder!"; }
  else if (gpaFinal >= 3) { rank = " Sweet!"; }
  else { rank = "Error!"; }

  return rank;
}

}

class Unit{
  private String rawLevel = "S";
  private String rawName,rawTypename = "";
  private Double rawCredit;
  private Double rawScore,rawIdentifier = 0.0;
  private boolean rawType = true;
  private Double[] NLAPList = {0.0, 2.6, 3.0, 3.3, 3.6, 3.9, 4.2, 4.5}; //Credits for Language AP IN ORDER
  private Double[] NLHPLUSList = {0.0, 2.25, 2.65, 2.95, 3.25, 3.55, 3.85, 4.15}; //Credits for Language S+ IN ORDER
  private Double[] NLHList= {0.0, 2.4, 2.8, 3.1, 3.4, 3.7, 4.0, 4.3}; //Credits for NonLanguage H IN ORDER
  private Double[] NLSPLUSList= {0.0, 2.25, 2.65, 2.95, 3.25, 3.55, 3.85, 4.15}; //Credits for NonLanguage S+ IN ORDER
  private Double[] NLSList= {0.0, 2.1, 2.5, 2.8, 3.1, 3.4, 3.7, 4.0}; //Credits for NonLanguage S IN ORDER
  private Double[] LAPList= {0.0, 2.6, 3.0, 3.3, 3.6, 3.9, 4.2, 4.5}; //Credits for Language AP IN ORDER
  private Double[] LHPLUSList= {0.0, 2.5, 2.9, 3.2, 3.5, 3.8, 4.1, 4.4}; //Credits for Language H+ IN ORDER
  private Double[] LHList= {0.0, 2.4, 2.8, 3.1, 3.4, 3.7, 4.0, 4.3}; //Credits for Language H IN ORDER
  private Double[] LSPLUSList= {0.0, 2.2, 2.6, 2.9, 3.2, 3.5, 3.8, 4.1}; //Credits for Language S+ IN ORDER
  private Double[] LSList= {0.0, 2.1, 2.5, 2.8, 3.1, 3.4, 3.7, 4.0}; //Credits for Language S IN ORDER

public Unit(String name, Double credit, Double type) {
  rawName = name;
  rawCredit = credit;
  rawIdentifier = type;
  rawScore = 0.0;
  convertType(rawIdentifier);
  
}

private void convertType(Double type){
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

public void setScore(Double score){
  rawScore = score;
}

public void setLevel(String level) {
  rawLevel = level;
}

public String getLevel() {
  return rawLevel;
}

public Double getScore(){
  return rawScore;
}

public Double getCredit() {
  return rawCredit;
}

public boolean getType() {
  return rawType;
} 

//Data Importation Function
public Double getGPA(){
  if (rawType == true) {  //false is non-language, true is language
  return rawCredit * getL();
  }
  else{
  return rawCredit * getNL();
  }
}

 //Subject Categorization Function
 public Double getNL() {
  //console.log(Level);
    if (rawLevel == "AP") {
    return calGPA(NLAPList);
  }
    if (rawLevel == "H+") {
    return calGPA(NLHPLUSList);
    
  }
    if (rawLevel == "H") {
    return calGPA(NLHList);

  }
    if (rawLevel == "S+") {
    return calGPA(NLSPLUSList);

  }
    if (rawLevel == "S") {
    return calGPA(NLSList);
  }

}

public Double getL() {
  //console.log(Level);
  if (rawLevel == "AP") {
    return calGPA(LAPList);
  }
  if (rawLevel == "H+") {
    return calGPA(LHPLUSList);

  }
  if (rawLevel == "H") {
    return calGPA(LHList);

  }
  if (rawLevel == "S+") {
    return calGPA(LSPLUSList);

  }
  if (rawLevel == "S") {
    return calGPA(LSList);
  }

}

public Double calGPA(Double[] list){
 Double gpa;
  //console.log(list);
  //console.log(listname);
  //console.log(data.[listname])
  //console.log("AP",Score)
  if (rawScore <= 59)
    gpa = list[0];
  if (rawScore > 59 && rawScore <= 67)
    gpa = list[1];
  if (rawScore > 67 && rawScore <= 72)
    gpa = list[2];
  if (rawScore > 72 && rawScore <= 77)
    gpa = list[3];
  if (rawScore > 77 && rawScore <= 82)
    gpa = list[4];
  if (rawScore > 82 && rawScore <= 87)
    gpa = list[5];
  if (rawScore > 87 && rawScore <= 92)
    gpa = list[6];
  if (rawScore > 92 && rawScore <= 100)
    gpa = list[7];
  //console.log(gpa)
  return gpa;
}

public String  toString() {
    return ("Subject Name: " + rawName + " Subject Credit: " + rawCredit + " Subject Type: " + rawTypename + " Subject Score: " + rawScore + " Subject Level: " + rawLevel);
}

}
