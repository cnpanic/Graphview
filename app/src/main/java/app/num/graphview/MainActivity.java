package app.num.graphview;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jjoe64.graphview.DefaultLabelFormatter;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.ValueDependentColor;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.DataPointInterface;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.PointsGraphSeries;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Line Graph

        GraphView line_graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> line_series =
                new LineGraphSeries<DataPoint>(new DataPoint[] {
                        new DataPoint(0, 2),
                        new DataPoint(1, 120),
                        new DataPoint(2, 21),
                        new DataPoint(3, 139),
                        new DataPoint(4, 27),
                        new DataPoint(5, 2),
                        new DataPoint(6, 120),
                        new DataPoint(7, 21),
                        new DataPoint(8, 139),
                        new DataPoint(9, 27),
                        new DataPoint(10, 2),
                        new DataPoint(11, 120),
                        new DataPoint(12, 21),
                        new DataPoint(13, 139),
                        new DataPoint(14, 27),
                        new DataPoint(15, 2),
                        new DataPoint(16, 120),
                        new DataPoint(17, 21),
                        new DataPoint(18, 139),
                        new DataPoint(19, 27),
        });
        line_graph.addSeries(line_series);

        // set the bound

        // set manual X bounds // x값 최대 최소
        line_graph.getViewport().setXAxisBoundsManual(true);
        line_graph.getViewport().setMinX(0.0);
        line_graph.getViewport().setMaxX(60.0);

        // set manual Y bounds
        line_graph.getViewport().setYAxisBoundsManual(true);
        line_graph.getViewport().setMinY(0);
        line_graph.getViewport().setMaxY(160);

        line_graph.getViewport().setScrollable(true);
        

        // set the dynamically label

        /*line_graph.getGridLabelRenderer().setLabelFormatter(new DefaultLabelFormatter() {
            @Override
            public String formatLabel(double value, boolean isValueX) {
                if (isValueX) {
                    // show normal x values
                    return super.formatLabel(value, isValueX);
                } else {
                    // show currency for y values
                    return super.formatLabel(value, isValueX) + " $";
                }
            }
        });*/

        //set the static label
       /* StaticLabelsFormatter staticLabelsFormatter = new StaticLabelsFormatter(line_graph);
        staticLabelsFormatter.setHorizontalLabels(new String[] {"Jan", "Feb", "March"});
        staticLabelsFormatter.setVerticalLabels(new String[] {"Sun", "Mon", "Tue"});
        line_graph.getGridLabelRenderer().setLabelFormatter(staticLabelsFormatter);*/


        // custom paint to make a dotted line
       /* Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        paint.setPathEffect(new DashPathEffect(new float[]{8, 5}, 0));
        line_series.setCustomPaint(paint);*/


       // set the radius of data point
       /* line_series.setDrawDataPoints(true);
        line_series.setDataPointsRadius(10);*/


        // set the background color below the line
        /*line_series.setDrawBackground(true);
        line_series.setBackgroundColor(Color.BLUE);*/


       // set the thickness of line
       // line_series.setThickness(20);

    }
}
