function Run()
 {
   var total = 0;
   var present_Rank = Rank(rank);
   var rank = ""
   var SubjectList = new Array ("Chi","Eng","Math","Chem","Phy","Ele","His")
   for (var count=0;count<SubjectList.length;count++)
   {
        total += getGpa(SubjectList[count]);
   }
   var GPAFinal=total/30.5;
   if (GPAFinal <= 3 )
     {rank = " Try harder!";}
   else if (GPAFinal >=3)
     {rank = " Sweet!";}
   else
     {rank = "Error!";}
   document.getElementById("ResultArea").value = ("Your GPA is "+GPAFinal.toFixed(2)+","+present_Rank);
}
function getGpa(subject){
  var subScore = parseInt(document.getElementById(subject).value);
  var level = subject+"Level";
  var subLev = (document.getElementById(level).value);
  if(subject=="Math")
    return 6.5*getNL(subLev,subScore);
  if(subject=="Chi")
    return 3.0*getL(subLev,subScore);
  if(subject=="Eng")
    return 6.5*getL(subLev,subScore);
  if(subject=="Chem")
    return 4.0*getNL(subLev,subScore);
  if(subject=="Phy")
    return 4.0*getNL(subLev,subScore);
  if(subject=="His")
    return 4.0*getNL(subLev,subScore);
  if(subject=="Ele")
    return 2.5*getNL(subLev,subScore);
}
function getNL(Level,Score){
  if(Level == "H"){
    return NonLanguageH(Score);
  }
  if(Level == "S2")
    return NonLanguageSPlus(Score);
  if(Level == "S1")
    return NonLanguageS(Score);
}
function getL(Level,Score){
  if(Level == "H2"){
    return LanguageHPlus(Score);
  }
  if(Level == "H1")
    return LanguageH(Score);
  if(Level == "S2")
    return LanguageSPlus(Score);
  if(Level == "S1")
    return LanguageS(Score);
    if(Level == "N5")
      return LanguageN5(Score);
    if(Level == "N4")
      return LanguageN4(Score);
    if(Level == "N3")
      return LanguageN3(Score);
    if(Level == "N2")
      return LanguageN2(Score);
    if(Level == "N1")
      return LanguageN1(Score);
        }
function NonLanguageH(Score)
  {
    var gpa = 0;
    if(Score<=59 )
      gpa = 0;
    if(Score >59 && Score<=67)
      gpa = 2.4;
    if(Score >67 && Score<=72)
      gpa = 2.8;
    if(Score >72 && Score<=77)
      gpa = 3.1;
    if(Score >77 && Score<=82)
      gpa = 3.4;
    if(Score >82 && Score<=87)
      gpa = 3.7;
    if(Score >87 && Score<=92)
      gpa = 4.0;
    if(Score >92 && Score<=100)
      gpa = 4.3;
    return gpa;
  }
function NonLanguageSPlus(Score)
  {
    var gpa = 0;
    if(Score<=59 )
      gpa = 0;
    if(Score >59 && Score<=67)
      gpa = 2.25;
    if(Score >67 && Score<=72)
      gpa = 2.65;
    if(Score >72 && Score<=77)
      gpa = 2.95;
    if(Score >77 && Score<=82)
      gpa = 3.25;
    if(Score >82 && Score<=87)
      gpa = 3.55;
    if(Score >87 && Score<=92)
      gpa = 3.85;
    if(Score >92 && Score<=100)
      gpa = 4.15;
    return gpa;
  }
function NonLanguageS(Score)
      {
        var gpa = 0;
        if(Score<=59 )
          gpa = 0;
        if(Score >59 && Score<=67)
          gpa = 2.1;
        if(Score >67 && Score<=72)
          gpa = 2.5;
        if(Score >72 && Score<=77)
          gpa = 2.8;
        if(Score >77 && Score<=82)
          gpa = 3.1;
        if(Score >82 && Score<=87)
          gpa = 3.4;
        if(Score >87 && Score<=92)
          gpa = 3.7;
        if(Score >92 && Score<=100)
          gpa = 4.0;
        return gpa;
      }
function LanguageHPlus(Score)
          {
            var gpa = 0;
            if(Score<=59 )
              gpa = 0;
            if(Score >59 && Score<=67)
              gpa = 2.5;
            if(Score >67 && Score<=72)
              gpa = 2.9;
            if(Score >72 && Score<=77)
              gpa = 3.2;
            if(Score >77 && Score<=82)
              gpa = 3.5;
            if(Score >82 && Score<=87)
              gpa = 3.8;
            if(Score >87 && Score<=92)
              gpa = 4.1;
            if(Score >92 && Score<=100)
              gpa = 4.4;
            return gpa;
          }
function LanguageH(Score)
                    {
                      var gpa = 0;
                      if(Score<=59 )
                        gpa = 0;
                      if(Score >59 && Score<=67)
                        gpa = 2.4;
                      if(Score >67 && Score<=72)
                        gpa = 2.8;
                      if(Score >72 && Score<=77)
                        gpa = 3.1;
                      if(Score >77 && Score<=82)
                        gpa = 3.4;
                      if(Score >82 && Score<=87)
                        gpa = 3.7;
                      if(Score >87 && Score<=92)
                        gpa = 4.0;
                      if(Score >92 && Score<=100)
                        gpa = 4.3;
                      return gpa;
                    }
function LanguageSPlus(Score)
          {
            var gpa = 0;
            if(Score<=59 )
              gpa = 0;
            if(Score >59 && Score<=67)
              gpa = 2.2;
            if(Score >67 && Score<=72)
              gpa = 2.6;
            if(Score >72 && Score<=77)
              gpa = 2.9;
            if(Score >77 && Score<=82)
              gpa = 3.2;
            if(Score >82 && Score<=87)
              gpa = 3.5;
            if(Score >87 && Score<=92)
              gpa = 3.8;
            if(Score >92 && Score<=100)
              gpa = 4.1;
            return gpa;
          }
function LanguageS(Score)
  {
  var gpa = 0;
  if(Score<=59 )
  gpa = 0;
  if(Score >59 && Score<=67)
  gpa = 2.1;
    if(Score >67 && Score<=72)
        gpa = 2.5;
        if(Score >72 && Score<=77)
            gpa = 2.8;
  if(Score >77 && Score<=82)
        gpa = 3.1;
          if(Score >82 && Score<=87)
          gpa = 3.4;
    if(Score >87 && Score<=92)
      gpa = 3.7;
    if(Score >92 && Score<=100)
      gpa = 4.0;
    return gpa;
                              }
                              function LanguageN5(Score)
                                                                                                        {
                                                                                                          var gpa = 0;
                                                                                                          if(Score<=59 )
                                                                                                            gpa = 0;
                                                                                                          if(Score >59 && Score<=67)
                                                                                                            gpa = 2.3;
                                                                                                          if(Score >67 && Score<=72)
                                                                                                            gpa = 2.7;
                                                                                                          if(Score >72 && Score<=77)
                                                                                                            gpa = 3.0;
                                                                                                          if(Score >77 && Score<=82)
                                                                                                            gpa = 3.3;
                                                                                                          if(Score >82 && Score<=87)
                                                                                                            gpa = 3.6;
                                                                                                          if(Score >87 && Score<=92)
                                                                                                            gpa = 3.9;
                                                                                                          if(Score >92 && Score<=100)
                                                                                                            gpa = 4.2;
                                                                                                          return gpa;
                                                                                                        }
                              function LanguageN4(Score)
                                                                                                            {
                                                                                                              var gpa = 0;
                                                                                                              if(Score<=59 )
                                                                                                                gpa = 0;
                                                                                                              if(Score >59 && Score<=67)
                                                                                                                gpa = 2.2;
                                                                                                              if(Score >67 && Score<=72)
                                                                                                                gpa = 2.6;
                                                                                                              if(Score >72 && Score<=77)
                                                                                                                gpa = 2.9;
                                                                                                              if(Score >77 && Score<=82)
                                                                                                                gpa = 3.2;
                                                                                                              if(Score >82 && Score<=87)
                                                                                                                gpa = 3.5;
                                                                                                              if(Score >87 && Score<=92)
                                                                                                                gpa = 3.8;
                                                                                                              if(Score >92 && Score<=100)
                                                                                                                gpa = 4.1;
                                                                                                              return gpa;
                                                                                                            }
                              function LanguageN3(Score)
                                                                                                                      {
                                                                                                                        var gpa = 0;
                                                                                                                        if(Score<=59 )
                                                                                                                          gpa = 0;
                                                                                                                        if(Score >59 && Score<=67)
                                                                                                                          gpa = 2.2;
                                                                                                                        if(Score >67 && Score<=72)
                                                                                                                          gpa = 2.6;
                                                                                                                        if(Score >72 && Score<=77)
                                                                                                                          gpa = 2.9;
                                                                                                                        if(Score >77 && Score<=82)
                                                                                                                          gpa = 3.2;
                                                                                                                        if(Score >82 && Score<=87)
                                                                                                                          gpa = 3.5;
                                                                                                                        if(Score >87 && Score<=92)
                                                                                                                          gpa = 3.8;
                                                                                                                        if(Score >92 && Score<=100)
                                                                                                                          gpa = 4.1;
                                                                                                                        return gpa;
                                                                                                                      }
                              function LanguageN2(Score)
                                                                                                            {
                                                                                                              var gpa = 0;
                                                                                                              if(Score<=59 )
                                                                                                                gpa = 0;
                                                                                                              if(Score >59 && Score<=67)
                                                                                                                gpa = 2.1;
                                                                                                              if(Score >67 && Score<=72)
                                                                                                                gpa = 2.5;
                                                                                                              if(Score >72 && Score<=77)
                                                                                                                gpa = 2.8;
                                                                                                              if(Score >77 && Score<=82)
                                                                                                                gpa = 3.1;
                                                                                                              if(Score >82 && Score<=87)
                                                                                                                gpa = 3.4;
                                                                                                              if(Score >87 && Score<=92)
                                                                                                                gpa = 3.7;
                                                                                                              if(Score >92 && Score<=100)
                                                                                                                gpa = 4.0;
                                                                                                              return gpa;
                                                                                                            }
                              function LanguageN1(Score)
                                                                                                                        {
                                                                                                                          var gpa = 0;
                                                                                                                          if(Score<=59 )
                                                                                                                            gpa = 0;
                                                                                                                          if(Score >59 && Score<=67)
                                                                                                                            gpa = 2.1;
                                                                                                                          if(Score >67 && Score<=72)
                                                                                                                            gpa = 2.5;
                                                                                                                          if(Score >72 && Score<=77)
                                                                                                                            gpa = 2.8;
                                                                                                                          if(Score >77 && Score<=82)
                                                                                                                            gpa = 3.1;
                                                                                                                          if(Score >82 && Score<=87)
                                                                                                                            gpa = 3.4;
                                                                                                                          if(Score >87 && Score<=92)
                                                                                                                            gpa = 3.7;
                                                                                                                          if(Score >92 && Score<=100)
                                                                                                                            gpa = 4.0;
                                                                                                                          return gpa;
                                                                                                                        }
function Rank(GPAFinal)
  {
    var rank = "";
    if (GPAFinal <=3)
      rank= "Not good";
    if (GPAFinal >=3 && GPAFinal <=3.2)
      rank= "213~198";
    if (GPAFinal >=3.2 && GPAFinal <=3.4)
      rank= " 197~165";
    if (GPAFinal >=3.4 && GPAFinal <=3.6)
      rank= "164~118";
    if (GPAFinal >=3.6 && GPAFinal <=3.8)
      rank= "117~89";
    if (GPAFinal >=3.6 && GPAFinal <=4.0)
      rank= "88~30";
    if (GPAFinal >=4.0 && GPAFinal <=4.3)
      rank= "29~1";
  }
