//Setup 1 EditText ,1 Button ,1 TextView
Button button;
EditText text;
TextView view;

button = findViewById(R.id.button);
text = findViewById(R.id.pers);
view = findViewById(R.id.tv);

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        //get String from input bar
        String msg = text.getText().toString();
      
        view.setText(msg);
    }
});
