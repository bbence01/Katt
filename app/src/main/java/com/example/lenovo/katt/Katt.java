package com.example.lenovo.katt;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Katt extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;


    TextView nyert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katt);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        nyert= (TextView)findViewById(R.id.nyert);

        Random r1 = new Random();
        int s1 =  r1.nextInt(4)+1;

        switch (s1){
            case 1: {
                button1.setBackgroundColor(getResources().getColor(R.color.colorblue));
                break;
            }
            case 2: {
                button1.setBackgroundColor(getResources().getColor(R.color.colorred));
                break;
            }
            case 3: {
                button1.setBackgroundColor(getResources().getColor(R.color.coloryel));
                break;
            }
            case 4: {
                button1.setBackgroundColor(getResources().getColor(R.color.colorgreen));
                break;
            }


        }

        Random r2 = new Random();
        int s2 =  r2.nextInt(4)+1;

        switch (s2) {
            case 1: {
                button2.setBackgroundColor(getResources().getColor(R.color.colorblue));
                break;
            }
            case 2: {
                button2.setBackgroundColor(getResources().getColor(R.color.colorred));
                break;
            }
            case 3: {
                button2.setBackgroundColor(getResources().getColor(R.color.coloryel));
                break;
            }
            case 4: {
                button2.setBackgroundColor(getResources().getColor(R.color.colorgreen));
                break;
            }
        }

        Random r3 = new Random();
        int s3 =  r3.nextInt(4)+1;

        switch (s3){
            case 1: {
                button3.setBackgroundColor(getResources().getColor(R.color.colorblue));
                break;
            }
            case 2: {
                button3.setBackgroundColor(getResources().getColor(R.color.colorred));
                break;
            }
            case 3: {
                button3.setBackgroundColor(getResources().getColor(R.color.coloryel));
                break;
            }
            case 4: {
                button3.setBackgroundColor(getResources().getColor(R.color.colorgreen));
                break;
            }


        }

        Random r4 = new Random();
        int s4 =  r4.nextInt(4)+1;

        switch (s4){
            case 1: {
                button4.setBackgroundColor(getResources().getColor(R.color.colorblue));
                break;
            }
            case 2: {
                button4.setBackgroundColor(getResources().getColor(R.color.colorred));
                break;
            }
            case 3: {
                button4.setBackgroundColor(getResources().getColor(R.color.coloryel));
                break;
            }
            case 4: {
                button4.setBackgroundColor(getResources().getColor(R.color.colorgreen));
                break;
            }


        }










        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                int s =  r.nextInt(4)+1;

                switch (s){
                    case 1: {
                        button1.setBackgroundColor(getResources().getColor(R.color.colorblue));
                        break;
                    }
                    case 2: {
                        button1.setBackgroundColor(getResources().getColor(R.color.colorred));
                        break;
                    }
                    case 3: {
                        button1.setBackgroundColor(getResources().getColor(R.color.coloryel));
                        break;
                    }
                    case 4: {
                        button1.setBackgroundColor(getResources().getColor(R.color.colorgreen));
                        break;
                    }


                }


                ColorDrawable buttonColor1= (ColorDrawable) button1.getBackground();
                int colorId1 = buttonColor1.getColor();
                ColorDrawable buttonColor2 = (ColorDrawable) button2.getBackground();
                int colorId2 = buttonColor2.getColor();
                ColorDrawable buttonColor3= (ColorDrawable) button3.getBackground();
                int colorId3 = buttonColor3.getColor();
                ColorDrawable buttonColor4 = (ColorDrawable) button4.getBackground();
                int colorId4 = buttonColor4.getColor();
                if ( (colorId1==colorId2)&&(colorId2==colorId3)&&(colorId3==colorId4)&&(colorId4==colorId4) ){
                    nyert.setText("Nyert");
                }
                else{
                    nyert.setText("Nem nyert");
                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                int s =  r.nextInt(4)+1;

                switch (s){
                    case 1: {
                        button2.setBackgroundColor(getResources().getColor(R.color.colorblue));
                        break;
                    }
                    case 2: {
                        button2.setBackgroundColor(getResources().getColor(R.color.colorred));
                        break;
                    }
                    case 3: {
                        button2.setBackgroundColor(getResources().getColor(R.color.coloryel));
                        break;
                    }
                    case 4: {
                        button2.setBackgroundColor(getResources().getColor(R.color.colorgreen));
                        break;
                    }


                }


                ColorDrawable buttonColor1= (ColorDrawable) button1.getBackground();
                int colorId1 = buttonColor1.getColor();
                ColorDrawable buttonColor2 = (ColorDrawable) button2.getBackground();
                int colorId2 = buttonColor2.getColor();
                ColorDrawable buttonColor3= (ColorDrawable) button3.getBackground();
                int colorId3 = buttonColor3.getColor();
                ColorDrawable buttonColor4 = (ColorDrawable) button4.getBackground();
                int colorId4 = buttonColor4.getColor();
                if ( (colorId1==colorId2)&&(colorId2==colorId3)&&(colorId3==colorId4)&&(colorId4==colorId1) ){
                    nyert.setText("Nyert");
                }
                else{
                    nyert.setText("Nem nyert");
                }

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                int s =  r.nextInt(4)+1;

                switch (s){
                    case 1: {
                        button3.setBackgroundColor(getResources().getColor(R.color.colorblue));
                        break;
                    }
                    case 2: {
                        button3.setBackgroundColor(getResources().getColor(R.color.colorred));
                        break;
                    }
                    case 3: {
                        button3.setBackgroundColor(getResources().getColor(R.color.coloryel));
                        break;
                    }
                    case 4: {
                        button3.setBackgroundColor(getResources().getColor(R.color.colorgreen));
                        break;
                    }


                }


                ColorDrawable buttonColor1= (ColorDrawable) button1.getBackground();
                int colorId1 = buttonColor1.getColor();
                ColorDrawable buttonColor2 = (ColorDrawable) button2.getBackground();
                int colorId2 = buttonColor2.getColor();
                ColorDrawable buttonColor3= (ColorDrawable) button3.getBackground();
                int colorId3 = buttonColor3.getColor();
                ColorDrawable buttonColor4 = (ColorDrawable) button4.getBackground();
                int colorId4 = buttonColor4.getColor();
                if ( (colorId1==colorId2)&&(colorId2==colorId3)&&(colorId3==colorId4)&&(colorId4==colorId1) ){
                    nyert.setText("Nyert");
                }
                else{
                    nyert.setText("Nem nyert");
                }

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                int s =  r.nextInt(4)+1;

                switch (s){
                    case 1: {
                        button4.setBackgroundColor(getResources().getColor(R.color.colorblue));
                        break;
                    }
                    case 2: {
                        button4.setBackgroundColor(getResources().getColor(R.color.colorred));
                        break;
                    }
                    case 3: {
                        button4.setBackgroundColor(getResources().getColor(R.color.coloryel));
                        break;
                    }
                    case 4: {
                        button4.setBackgroundColor(getResources().getColor(R.color.colorgreen));
                        break;
                    }


                }


                ColorDrawable buttonColor1= (ColorDrawable) button1.getBackground();
                int colorId1 = buttonColor1.getColor();
                ColorDrawable buttonColor2 = (ColorDrawable) button2.getBackground();
                int colorId2 = buttonColor2.getColor();
                ColorDrawable buttonColor3= (ColorDrawable) button3.getBackground();
                int colorId3 = buttonColor3.getColor();
                ColorDrawable buttonColor4 = (ColorDrawable) button4.getBackground();
                int colorId4 = buttonColor4.getColor();
                if ( (colorId1==colorId2)&&(colorId2==colorId3)&&(colorId3==colorId4)&&(colorId4==colorId1) ){
                    nyert.setText("Nyert");
                }
                else{
                    nyert.setText("Nem nyert");
                }

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r1 = new Random();
                int s1 =  r1.nextInt(4)+1;

                switch (s1){
                    case 1: {
                        button1.setBackgroundColor(getResources().getColor(R.color.colorblue));
                        break;
                    }
                    case 2: {
                        button1.setBackgroundColor(getResources().getColor(R.color.colorred));
                        break;
                    }
                    case 3: {
                        button1.setBackgroundColor(getResources().getColor(R.color.coloryel));
                        break;
                    }
                    case 4: {
                        button1.setBackgroundColor(getResources().getColor(R.color.colorgreen));
                        break;
                    }


                }

                Random r2 = new Random();
                int s2 =  r2.nextInt(4)+1;

                switch (s2) {
                    case 1: {
                        button2.setBackgroundColor(getResources().getColor(R.color.colorblue));
                        break;
                    }
                    case 2: {
                        button2.setBackgroundColor(getResources().getColor(R.color.colorred));
                        break;
                    }
                    case 3: {
                        button2.setBackgroundColor(getResources().getColor(R.color.coloryel));
                        break;
                    }
                    case 4: {
                        button2.setBackgroundColor(getResources().getColor(R.color.colorgreen));
                        break;
                    }
                }

                    Random r3 = new Random();
                    int s3 =  r3.nextInt(4)+1;

                    switch (s3){
                        case 1: {
                            button3.setBackgroundColor(getResources().getColor(R.color.colorblue));
                            break;
                        }
                        case 2: {
                            button3.setBackgroundColor(getResources().getColor(R.color.colorred));
                            break;
                        }
                        case 3: {
                            button3.setBackgroundColor(getResources().getColor(R.color.coloryel));
                            break;
                        }
                        case 4: {
                            button3.setBackgroundColor(getResources().getColor(R.color.colorgreen));
                            break;
                        }


                    }

                    Random r4 = new Random();
                    int s4 =  r4.nextInt(4)+1;

                    switch (s4){
                        case 1: {
                            button4.setBackgroundColor(getResources().getColor(R.color.colorblue));
                            break;
                        }
                        case 2: {
                            button4.setBackgroundColor(getResources().getColor(R.color.colorred));
                            break;
                        }
                        case 3: {
                            button4.setBackgroundColor(getResources().getColor(R.color.coloryel));
                            break;
                        }
                        case 4: {
                            button4.setBackgroundColor(getResources().getColor(R.color.colorgreen));
                            break;
                        }


                    }






                    ColorDrawable buttonColor1= (ColorDrawable) button1.getBackground();
                int colorId1 = buttonColor1.getColor();
                ColorDrawable buttonColor2 = (ColorDrawable) button2.getBackground();
                int colorId2 = buttonColor2.getColor();
                ColorDrawable buttonColor3= (ColorDrawable) button3.getBackground();
                int colorId3 = buttonColor3.getColor();
                ColorDrawable buttonColor4 = (ColorDrawable) button4.getBackground();
                int colorId4 = buttonColor4.getColor();
                if ( (colorId1==colorId2)&&(colorId2==colorId3)&&(colorId3==colorId4)&&(colorId4==colorId1) ){
                    nyert.setText("Nyert");
                }
                else{
                    nyert.setText("Nem nyert");
                }

            }
        });



    }
}
