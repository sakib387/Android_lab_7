package com.example.myapplication;

public class questionLibrary {
    private  String questions []={
      "which part of the plants holds it in the soil?",
      "This part of the plant absorbs energy from the sun?",
      "This part of the plant attracts bees, butterflies anf ?",
      "the __ holds the plant upritht "
    };
    private  String choices[][]={
            {"Roots","strm","flower"},
            {"Fruits","Leaves","Seeds"},
            {"Bsrkt","flower","Roots"},
            {"Fruits","Leaves","Seeds"},
    };
    private  String answer[]={
            "Roots","Leaves","flower","Seeds"
    };
    public String getquestion(int a){
        return questions[a];
    }
    public String getchoice1(int a){
        return choices[a][0];
    }
    public String getchoice2(int a){
        return choices[a][1];
    }
    public String getchoice3(int a){
        return choices[a][2];
    }
    public String getans(int a){
        return answer[a];
    }
}

