package com.example.matheus.appnovo;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public class ExercicioTres {
        public static void main(String[] args) {
            EditText input = new EditText (System.in);
            Random ran = new Random();
            int y, tentativas = 3;
            int x = ran.nextInt(11);
            while (tentativas>0) {
                System.out.printf("Informe um numero");
                y = input.nextInt();
                if (x == y) {
                    System.out.println("Acertou!");
                    tentativas = 0;
                }else {
                    --tentativas;
                    System.out.println("Errou!");
                }
            }
            System.out.printf("O número era: %d \n", x);
        }
    }
}
