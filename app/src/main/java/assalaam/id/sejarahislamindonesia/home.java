package assalaam.id.sejarahislamindonesia;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;



public class home extends Activity {

    DialogInterface.OnClickListener listener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button call = (Button) findViewById(R.id.sejarah);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RadioButton) {
                Intent myIntent = new
                        Intent(RadioButton.getContext(), sejarah.class);
                startActivityForResult(myIntent, 0);

            }
        });



        Button call2 = (Button) findViewById(R.id.walisongo);
        call2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RadioButton) {
                Intent myIntent = new
                        Intent(RadioButton.getContext(), walisongo.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button call3 = (Button) findViewById(R.id.kerajaan);
        call3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RadioButton) {
                Intent myIntent = new
                        Intent(RadioButton.getContext(), kerajaan.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button call4 = (Button) findViewById(R.id.assalaam);
        call4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RadioButton) {
                Intent myIntent = new
                        Intent(RadioButton.getContext(), tentang.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button call5 = (Button) findViewById(R.id.profil);
        call5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RadioButton) {
                Intent myIntent = new
                        Intent(RadioButton.getContext(), profile.class);
                startActivityForResult(myIntent, 0);

            }
        });

    }

    private void  exit() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Apakah Kamu Benar-benar ingin keluar ?")
                .setCancelable(false)
                .setPositiveButton("Ya", new
                        DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {
                                home.this.finish();
                            }
                        })
                .setNegativeButton("Tidak", new
                        DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog,
                                                int arg1) {
                                //TODO Auto-generated method stub
                                dialog.cancel();
                            }
                        }).show();




    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //jika tombol BACK ditekan
        if(keyCode == KeyEvent.KEYCODE_BACK){
            Keluar();
        }
        return super.onKeyDown(keyCode,event );
    }

    //method untuk keluar aplikasi menggunakan dialog terlebih dahulu
    private void Keluar() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Apakah anda yakin ingin keluar?");
        builder.setCancelable(false);//tombol BACK tidak bisa tekan

        //Membuat listener untuk tombol DIALOG
        listener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(which==DialogInterface.BUTTON_POSITIVE){
                    finish(); //keluar aplikasi
                }else if(which==DialogInterface.BUTTON_NEGATIVE){
                    dialog.cancel(); //batal keluar
                }
            }
        };

        //menerapkan listener pada tombol ya dan tidak
        builder.setPositiveButton("Ya", listener);
        builder.setNegativeButton("Tidak", listener);
        builder.show(); //menampilkan dialog
    }

}
