package ankit.developer.unknowns.easyandroidanimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;

import com.easyandroidanimations.library.Animation;
import com.easyandroidanimations.library.AnimationListener;
import com.easyandroidanimations.library.BounceAnimation;
import com.easyandroidanimations.library.ExplodeAnimation;
import com.easyandroidanimations.library.FlipHorizontalAnimation;
import com.easyandroidanimations.library.FlipVerticalAnimation;
import com.easyandroidanimations.library.ParallelAnimator;
import com.easyandroidanimations.library.ScaleInAnimation;
import com.easyandroidanimations.library.ScaleOutAnimation;
import com.easyandroidanimations.library.SlideInAnimation;
import com.easyandroidanimations.library.SlideOutAnimation;

public class MainActivity extends AppCompatActivity {
    Button btnAnim,btnAnim1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAnim = (Button)findViewById(R.id.btnAnim);
        btnAnim1 = (Button)findViewById(R.id.btnAnim1);
        btnAnim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //new SlideOutAnimation(btnAnim).animate();
                //new SlideInAnimation(btnAnim).animate();

                //new BounceAnimation(btnAnim).animate();

              /*  new BounceAnimation(btnAnim)
                        .setBounceDistance(50)
                        .setNumOfBounces(5)
                        .setDuration(500)
                        .animate();*/

              /*  new ExplodeAnimation(btnAnim)
                        .setExplodeMatrix(ExplodeAnimation.MATRIX_2X2)
                        .setInterpolator(new DecelerateInterpolator())
                        .setDuration(500)
                        .setListener(new AnimationListener() {
                            @Override
                            public void onAnimationEnd(Animation animation) {

                            }
                        })
                        .animate();*/
                /*    new ParallelAnimator()
                            .add(new ScaleInAnimation(btnAnim))
                            .add(new FlipHorizontalAnimation(btnAnim1))
                            .setDuration(500)
                            .animate();*/

               // new ScaleInAnimation(btnAnim).animate();

               // new FlipHorizontalAnimation(btnAnim).animate();

                //new ScaleOutAnimation(btnAnim).animate();

                new FlipVerticalAnimation(btnAnim).animate();
            }
        });
    }
}
