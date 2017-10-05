package bigger.gradle.maaclab.ac.gradlebiggerapplication;

import android.content.Context;
import android.support.v4.util.Pair;
import android.test.AndroidTestCase;
import android.util.Log;
import static android.support.test.InstrumentationRegistry.getInstrumentation;

import java.util.concurrent.TimeUnit;

import static android.support.test.InstrumentationRegistry.getInstrumentation;

/**
 * Created by Wipro on 28-09-2017.
 */

public class AsyncTaskTest extends AndroidTestCase {

    private static final String TAG = AsyncTaskTest.class.getSimpleName();

    public void testJokeDownload() {

        try {
            EndpointsAsyncTask task = new EndpointsAsyncTask();
            task.execute(new Pair<Context, String>(getInstrumentation().getContext() , "Ankit"));
//                        task.execute(new Pair<Context, String>(getInstrumentation().getContext() , "Ankit"));
            String joke = task.get(30, TimeUnit.SECONDS);
            assertNotNull(joke);
            assertTrue(joke.length() > 0);

        } catch (Exception e) {
            Log.e(TAG, Log.getStackTraceString(e));
        }
    }

}
