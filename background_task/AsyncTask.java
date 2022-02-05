//we will scrap an html of google.com and will set the output in TextView with help of onPostExecute() method
//We will extend the class AsynTask and will override its methods
public class BG extends AsyncTask<String ,Void ,String> {
  
    //what should be done before executing the Background task
    @Override
    protected void onPreExecute() {
        super.onPreExecute();

        Log.d("Zed-logs", "PreExecute running");
    }

    //what should be done once the task execution completes
    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        Log.d("Zed-logs", "PostExecute running");

        Log.d("Zed-logs", s);
        TextView txt = findViewById(R.id.a_stat);
        txt.setText(s);
    }

    //what task needs to be done in background
    protected String doInBackground(String... urls) {
        Log.d("Zed-logs", "doInBackground running");
        String res = "";
        URL url;

        HttpURLConnection con;
        try {
            url = new URL(urls[0]);
            con = (HttpURLConnection) url.openConnection();
            InputStream in = con.getInputStream();
            InputStreamReader reader = new InputStreamReader(in);
            int data = reader.read();

            while (data != -1) {
                char curr = (char) data;
                res += curr;
                data = reader.read();
            }

            return res;
        } catch (Exception e) {
            e.printStackTrace();
            return "ERR";
        }
    }
}

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //create an object of BG class and run the task 
    BG task = new BG();
    task.execute("https://www.google.com");

}

}
