package projetoactivity.thiago.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


public class MainActivity extends Activity {

    private CheckBox checkBoxcao;
    private CheckBox checkBoxgato;
    private CheckBox checkBoxpapagaio;

    private Button botaoMostrar;
    private TextView TextoExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxcao = (CheckBox)findViewById(R.id.checkBoxCaoID);
        checkBoxgato = (CheckBox)findViewById(R.id.checkBoxGatoID);
        checkBoxpapagaio = (CheckBox)findViewById(R.id.checkBoxPapagaioID);
        TextoExibicao = (TextView)findViewById(R.id.textoExibicaoID);
        botaoMostrar =  (Button)findViewById(R.id.botaoID);

        botaoMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itensSelecionados = "";
                itensSelecionados += "Item " + checkBoxcao.getText()+ "Status: " + checkBoxcao.isChecked() + "\n";
                itensSelecionados += "Item " + checkBoxgato.getText()+ "Status: " + checkBoxgato.isChecked() + "\n";
                itensSelecionados += "Item " + checkBoxpapagaio.getText()+ "Status: " + checkBoxpapagaio.isChecked() + "\n";

                TextoExibicao.setText(itensSelecionados);


            }
        });


    }
}
