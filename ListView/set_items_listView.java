ListView lview;
ArrayAdapter<String> adapter;
ArrayList<String> table_list;

//get the id of the ListView
lview= findViewById(R.id.table);

table_list = new ArrayList<String>();
for(int x = 1 ;x <= 10 ;x++){
  String ln =Integer.toString(x);
  table_list.add(ln);
}

adapter = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_activated_1 ,table_list);
lview.setAdapter(adapter);
