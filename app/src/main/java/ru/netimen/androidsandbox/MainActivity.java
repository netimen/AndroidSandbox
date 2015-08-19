package ru.netimen.androidsandbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import ru.netimen.dagger.BookmateReader;
import ru.netimen.dagger.BookmateReaderFragment_;
import ru.netimen.dagger.DaggerBookmateReaderComponent;
import ru.netimen.dagger.Document;
import ru.netimen.dagger.ReaderFragment;

public class MainActivity extends AppCompatActivity {


        String f(Object o) {
            return o.toString();
        }

        String f(Integer i) {
            return String.valueOf(i + 1);
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Object o = 3;
//        final String f = f(o instanceof Integer ? (Integer) o : o);
        final String f = f((Integer)o);
        setContentView(R.layout.activity_main);
//        ReaderFragment readerFragment = ReaderFragment_.builder().documentUuid("lalala").build();
        ReaderFragment readerFragment = BookmateReaderFragment_.builder().readerComponent(DaggerBookmateReaderComponent.builder().bookmateReader(new BookmateReader(new Document())).build()).build();
        getFragmentManager()
                .beginTransaction()
                .add(R.id.container, readerFragment, ReaderFragment.class.getSimpleName())
                .commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
