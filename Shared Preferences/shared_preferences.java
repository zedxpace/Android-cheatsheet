//I think understanding the Shared prefrence with example is always better
/*
 *In this we will have 1 EditText ,1 Button & 1 TextView
 *user will enter something int EditText and then will click on submit button and once button is hit
 *TextView will show the that text and even after we close the app again open textview will show it.
 *i can relate it with the serialization / de-serrialization somewhere.
 */
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    button = findViewById(R.id.button);
    text = findViewById(R.id.pers);
    view = findViewById(R.id.tv);

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //get String from input bar
            String msg = text.getText().toString();

            //shared preferences object
            SharedPreferences shrd = getSharedPreferences("dem" ,MODE_PRIVATE);
            SharedPreferences.Editor editor = shrd.edit();

            //put the msg we got from input - saving key value pair
            editor.putString("str" ,msg);

            //more of as commit like in database
            editor.apply();
            view.setText(msg);

        }
    });

    //Get the value of shared preference back
    //can relate to serialization-deserialization
    SharedPreferences get_shrd = getSharedPreferences("dem" ,MODE_PRIVATE);
    String var = get_shrd.getString("str" ,"okay bub");
    view.setText(var);
}
