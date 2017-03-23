package sdu.nattadon.animalforfun;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collection;

import static sdu.nattadon.animalforfun.R.id.ImbVolum;
import static sdu.nattadon.animalforfun.R.id.ImvQuetion;

public class Game extends AppCompatActivity {
//Explicit
    Button Btn1,Btn2,Btn3,Btn4;
    ImageView questiionImageView;
    MediaPlayer mediaPlayer;
    ImageButton volumnImageButton;
    int questionCount = 1;\\จำนวนข้อ
    ArrayList<Integer> qID = new ArrayList<Integer>();
    String amswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //initial view
        Btn1 = (button) findViewById(R.id.Btn1);
        Btn2 = (button) findViewById(R.id.Btn2);
        Btn3 = (button) findViewById(R.id.Btn3);
        Btn4 = (button) findViewById(R.id.Btn4);
        questiionImageView = (ImageView) findViewById(ImvQuetion);
        volumnImageButton = (ImageButton)findViewById(ImbVolum);

        for (int i=1; i<= questionCount; i++){
            qID.add(i);
        }
        Collection.shuffle(qID);
        Setquestiion(qID.remove(0));
    }

    private void Setquestiion(Integer qID) {
        if (qID == 1){
        amswer = "นก"
        questionImageView.setImageResource(R.drawable.bird_02);
            mediaPlayer = mediaPlayer.create(this,R.raw.bird);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("นก");
            choice.add("แมว");
            choice.add("วัว");
            choice.add("สุนัข");
            Collection.shuffle(choice);
            Btn1.setText(choice.remove(0));
            Btn2.setText(choice.remove(0));
            Btn3.setText(choice.remove(0));
            Btn4.setText(choice.remove(0));
    }
    //end setQuestion Metthod
    public void playSound(){
            mediaPlayer.start();
    }
}
}
