package com.sitopan.pdam;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class inputPasangBaru extends AppCompatActivity {

    EditText etnama, etnoTelp, etnoHp, etemail, etpekerjaan, etalamat, etnoRumah, etrt, etrw, etkodePos, etkecamatan, etkelurahan, etjumPenghuni,etjarakPipa,etjaringanPipa;


    Button bInput;
//    public static final String url ="http://192.168.89.185/pdam/konek.php";
    public static final String url ="https://pdamkendal.com/topan/insert.php";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_pasang_baru);

        etnama = (EditText) findViewById(R.id.inNama);
        etnoTelp = (EditText) findViewById(R.id.inNoTelp);
        etnoHp = (EditText) findViewById(R.id.inNoHp);
        etemail = (EditText) findViewById(R.id.inEmail);
        etpekerjaan = (EditText) findViewById(R.id.inPekerjaan);
        etalamat = (EditText) findViewById(R.id.inAlamat);
        etnoRumah = (EditText) findViewById(R.id.inNoRumah);
        etrt = (EditText) findViewById(R.id.inRt);
        etrw = (EditText) findViewById(R.id.inRw);
        etkodePos = (EditText) findViewById(R.id.inKodePos);
        etkecamatan = (EditText) findViewById(R.id.inKecamatan);
        etkelurahan = (EditText) findViewById(R.id.inKelurahan);
        etjumPenghuni = (EditText) findViewById(R.id.inJumPenghuni);
        etjaringanPipa = (EditText) findViewById(R.id.injaringanPipa);
        etjarakPipa = (EditText) findViewById(R.id.injarakPipa);


        bInput=(Button) findViewById(R.id.btnInput);


        bInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputData();


            }

        });
    }
    public void kosong(){
        etnama.setText(null);
        etnoTelp.getText().clear();
        etnoHp.getText().clear();
        etemail.getText().clear();
        etpekerjaan.getText().clear();
        etalamat.getText().clear();
        etnoRumah.getText().clear();
        etrt.getText().clear();
        etrw.getText().clear();
        etkodePos.getText().clear();
        etkecamatan.getText().clear();
        etkelurahan.getText().clear();
        etjumPenghuni.getText().clear();
        etjaringanPipa.getText().clear();
        etjarakPipa.getText().clear();
    }
    void inputData(){
        String nama = etnama.getText().toString();
        String noTelp = etnoTelp.getText().toString();
        String noHp = etnoHp.getText().toString();
        String email = etemail.getText().toString();
        String pekerjaan = etpekerjaan.getText().toString();
        String alamat = etalamat.getText().toString();
        String noRumah = etnoRumah.getText().toString();
        String rt = etrt.getText().toString();
        String rw = etrw.getText().toString();
        String kodePos = etkodePos.getText().toString();
        String kecamatan = etkecamatan.getText().toString();
        String kelurahan = etkelurahan.getText().toString();
        String jumPenghuni = etjumPenghuni.getText().toString();
        String jaringanPipa = etjaringanPipa.getText().toString();
        String jarakPipa = etjarakPipa.getText().toString();



        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
//                        if(!etnama.equals("") && !etnoTelp.equals("") && etnoHp.equals("") && etemail.equals("") && etpekerjaan.equals("") && etalamat.equals("") && etnoRumah.equals("") &&
//                                etrt.equals("") && etrw.equals("") && etkodePos.equals("") && etkecamatan.equals("") && etkelurahan.equals("") && etjumPenghuni.equals("") && etjaringanPipa.equals("") &&
//                                etjarakPipa.equals(""))
//                        {
//                            Toast.makeText(inputPasangBaru.this, "data jangan ada yang kosong", Toast.LENGTH_LONG).show();
//                        }
//                        else {
//                            Toast.makeText(inputPasangBaru.this, "data berhasil disimpan", Toast.LENGTH_LONG).show();
//                            kosong();
//                        }
                        Toast.makeText(inputPasangBaru.this, response, Toast.LENGTH_LONG).show();
                        kosong();

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(inputPasangBaru.this, "gagal koneksi ke server, cek setingan koneksi anda", Toast.LENGTH_LONG).show();
            }
        })
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                // Posting parameters ke post url
                Map<String, String> params = new HashMap<String, String>();

                params.put("nama",nama);
                params.put("notelp",noTelp);
                params.put("nohp",noHp);
                params.put("email",email);
                params.put("pekerjaan",pekerjaan);
                params.put("alamat",alamat);
                params.put("norumah",noRumah);
                params.put("rt",rt);
                params.put("rw",rw);
                params.put("kodePos",kodePos);
                params.put("kecamatan",kecamatan);
                params.put("kelurahan",kelurahan);
                params.put("jumPenghuni",jumPenghuni);
                params.put("jaringanPipa",jaringanPipa);
                params.put("jarakPipa",jarakPipa);
                return params;


            }
        };


        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(stringRequest);
    }

}


