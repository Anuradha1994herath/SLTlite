package com.example.acer.slt_lite;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.acer.slt_lite.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Acc extends AppCompatActivity {
    private static final String TAG = "Acc";
    public static final List<Product> PRODUCT_LIST = new ArrayList<Product>();
    ArrayList<String> name = new ArrayList<String>();
    ArrayList<String> dess = new ArrayList<String>();
    // ArrayList<String> imagename = new ArrayList<String>();
    ArrayList<Double> pricee = new ArrayList<Double>();
    ArrayList<String>  bbb = new ArrayList<String>();

    String data = "";
    String dataParse = "";
    String singleParse = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String id="5c472397fb6fc02d2ef115fb";
        // final Product PRODUCT1 = new Product(1, "Samsung Galaxy S6", BigDecimal.valueOf(199.996), "Worldly looks and top-notch specs make the impressive, metal Samsung Galaxy S6 the Android phone to beat for 2015", "samsung_galaxy_s6");
        //PRODUCT_LIST.add(PRODUCT1);
//        new PostDataTask().execute("http://localhost:4000/apii/getpurch/5c472397fb6fc02d2ef115fb");



        // TextView tvViewShoppingCart = (TextView)findViewById(R.id.tvViewShoppingCart);
        //  SpannableString content = new SpannableString(getText(R.string.shopping_cart));
        //   content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
        //  tvViewShoppingCart.setText(content);

        // tvViewShoppingCart.setOnClickListener(new View.OnClickListener() {
        //     @Override
        //     public void onClick(View v) {
        //       Intent intent = new Intent(Acc.this, ShoppingCartActivity.class);
        //  startActivity(intent);
        //    }
        // });



    }

//    public class GetDataTask extends AsyncTask<String, Void, String> {
//
//
//
//        ProgressDialog progressDialog;
//
//        @Override
//        protected void onPreExecute() {
//
//            super.onPreExecute();
//
//
//            // namee = username.getText().toString();
//            // acno = username.getText().toString();
//
//
//            progressDialog = new ProgressDialog(Acc.this);
//            progressDialog.setMessage("Loading data...");
//            progressDialog.show();
//
//
//        }
//
//        @Override
//        public String doInBackground(String... params) {
//
//
//
//            try{
//
//                return getData(params[0]);
//
//            }catch (IOException ex ){
//                return  "network error!";
//            }
//        }
//
//
//
//        @Override
//        protected void onPostExecute(String result) {
//            super.onPostExecute(result);
//
//
//            /*
//
//            Toast.makeText(mmmmm.this,test, Toast.LENGTH_SHORT).show();
//
//
//            if(kkk =="true" ){
//
//                Toast.makeText(mmmmm.this,"log in success", Toast.LENGTH_SHORT).show();
//                Intent homeActivity = new Intent(mmmmm.this,MainActivity.class);
//                common.uname = User.getText().toString();
//                startActivity(homeActivity);
//                finish();
//
//            }else{
//                Toast.makeText(mmmmm.this," please sign in", Toast.LENGTH_SHORT).show();
//
//
//            }
//
//            */
//
//
//            StringBuilder listString = new StringBuilder();
//            for (String s : name)
//                listString.append(s+"\n");
//
//            String descr = listString.toString();
//
//
//
//            for(int i=0;i<name.size();i++){
//                // String naaa = "product"+i;
//                Double d = pricee.get(i).doubleValue();
//                BigDecimal d1 = BigDecimal.valueOf(d);
//
//                Product naaa = new Product(1,name.get(i).toString(), d1, dess.get(i).toString(), "samsung_galaxy_s6",bbb.get(i).toString());
//                PRODUCT_LIST.add(naaa);
//            }
//
//
//            // String naaa = "product"+i;
//            //Product naaa = new Product(1,"Samsung Galaxy S6", BigDecimal.valueOf(199.996), "Worldly looks and top-notch specs make the impressive, metal Samsung Galaxy S6 the Android phone to beat for 2015", "samsung_galaxy_s6");
//            //PRODUCT_LIST.add(naaa);
//
//            ListView lvProducts = (ListView) findViewById(R.id.lvProducts);
//            lvProducts.addHeaderView(getLayoutInflater().inflate(R.layout.product_list_header, lvProducts, false));
//
//            ProductAdapter productAdapter = new ProductAdapter(Acc.this);
//            productAdapter.updateProducts(PRODUCT_LIST);
//
//            lvProducts.setAdapter(productAdapter);
//
//            lvProducts.setOnItemClickListener(new OnItemClickListener() {
//
//                @Override
//                public void onItemClick(AdapterView<?> parent, View view,
//                                        int position, long id) {
//                    Product product = PRODUCT_LIST.get(position - 1);
//                    Intent intent = new Intent(Acc.this, ProductActivity.class);
//                    Bundle bundle = new Bundle();
//                    bundle.putSerializable("product", product);
//                    Log.d(TAG, "View product: " + product.getName());
//                    intent.putExtras(bundle);
//                    startActivity(intent);
//                }
//            });
//
//
//
//
//            Toast.makeText(Acc.this,descr, Toast.LENGTH_SHORT).show();
//
//            if (progressDialog != null) {
//                progressDialog.dismiss();
//            }
//        }
//
//
//
//
//
//
//        public String getData(String urlPath) throws IOException {
//
//
//
//
//            StringBuilder result = new StringBuilder();
//            BufferedReader bufferedReader =null;
//
//            try {
//                //Initialize and config request, then connect to server
//                URL url = new URL(urlPath);
//                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
//                urlConnection.setReadTimeout(10000 /* milliseconds */);
//                urlConnection.setConnectTimeout(10000 /* milliseconds */);
//                urlConnection.setRequestMethod("GET");
//                urlConnection.setRequestProperty("Content-Type", "application/json");// set header
//                urlConnection.connect();
//
//                //Read data response from server
//                InputStream inputStream = urlConnection.getInputStream();
//                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//                String line;
//
//
//                while ((line = bufferedReader.readLine()) != null) {
//                    data = data + line;
//                    result.append(line).append("\n");
//                }
//
//
//
//                try {
//                    JSONArray ja = new JSONArray(data);
//
//
//
//                    for (int i =0; i<ja.length();i++){
//                        JSONObject jo = (JSONObject) ja.get(i);
//
//                        //  singleParse = (String) jo.get("firstname");
//                        //+ jo.get("likes") + jo.get("_id");
//
//
//                        //kkk = "true";
//                        name.add((String) jo.get("item"));
//                        dess.add((String) jo.get("brand"));
//                      //  imagename.add((String) jo.get("imagepath"));
//                        pricee.add((Double) jo.get("price"));
//
//
//                        // dess= (String) jo.get("firstname");
//                        // common.email = (String) jo.get("email");
//                        // common.sub = (String) jo.get("subarea");
//
//
//
//
//                        // test="no";
//
//
//                        dataParse = dataParse  + singleParse;
//
//                    }
//
//
//                }catch (Exception e){
//
//                }
//
//            } finally {
//                if (bufferedReader != null) {
//                    bufferedReader.close();
//                }
//            }
//
//
//
//            return result.toString();
//            // return dataParse.toString();
//        }
//    }
//public class PostDataTask extends AsyncTask<String, Void, String> {
//
//    // String uuname = user.getText().toString();
//
//    ProgressDialog progressDialog;
//
//    @Override
//    protected void onPreExecute() {
//        super.onPreExecute();
//        progressDialog = new ProgressDialog(Acc.this);
//        progressDialog.setMessage("Inserting dats...");
//        progressDialog.show();
//    }
//
//    @Override
//    protected String doInBackground(String... params) {
//
//
//
//
//        try {
//            return postData(params[0]);
//        } catch (IOException ex) {
//            return "Network error !";
//        } catch (JSONException ex) {
//            return "Data Invalid !";
//        }
//    }
//
//    @Override
//    protected void onPostExecute(String result) {
//        super.onPostExecute(result);
//
//        //mResult.setText(result);
//
//
//
////        Toast.makeText(Acc.this,"Complains", Toast.LENGTH_SHORT).show();
//
////        final ArrayList<PurchaseDetails> purchaseDetails = common.purch;
////        ListView PurchaseDetailsList = (ListView) findViewById(R.id.list);
////        PurchaseAdapter adapter = new PurchaseAdapter(Acc.this, purchaseDetails);
////        PurchaseDetailsList.setAdapter(adapter);
//
//
////        PurchaseDetailsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
////            @Override
////            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
////                common.itemPosition=Integer.toString(i);
////                common.complainDetails=complainDetails.get(i);
////                common.cars.clear();
////                Intent intent5 = new Intent(ActivityThree.this, complain_click_view.class);
////                startActivity(intent5);
////            }
////        });
//
//        if (progressDialog != null) {
//            progressDialog.dismiss();
//        }
//    }

//    public String postData(String urlPath) throws IOException, JSONException {
//
//        StringBuilder result = new StringBuilder();
//        BufferedWriter bufferedWriter = null;
//        BufferedReader bufferedReader = null;
//
//
//
//        try {
//
//
//            //  JSONObject objectk = new JSONObject();
//
//
//
//            //Create data to send to server
//            JSONObject dataToSend = new JSONObject();
//            //dataToSend.optJSONObject(String.valueOf(showsignupDialoge(objectk)));
//            dataToSend.put("authorization","earearear");
//
//
//
//
//            //Initialize and config request, then connect to server.
//
//            URL url = new URL(urlPath);
//            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
//            urlConnection.setReadTimeout(10000 /* milliseconds */);
//            urlConnection.setConnectTimeout(10000 /* milliseconds */);
//            urlConnection.setRequestMethod("POST");
//            urlConnection.setDoOutput(true);  //enable output (body data)
//            urlConnection.setRequestProperty("Content-Type", "application/json");
//            urlConnection.setRequestProperty("authorization", "asdad");
//            // set header
//            urlConnection.connect();
//
//            //Write data into server
//            OutputStream outputStream = urlConnection.getOutputStream();
//            bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
//            bufferedWriter.write(dataToSend.toString());
//            bufferedWriter.flush();
//
//            //Read data response from server
//            InputStream inputStream = urlConnection.getInputStream();
//            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//            String line;
//
//
//            while ((line = bufferedReader.readLine()) != null) {
//                data = data + line;
//                result.append(line).append("\n");
//            }
//
//
////
////                common.token = new StringBuffer(URLConnection.getDefaultRequestProperty("token"));
////                JSONArray jas = new JSONArray(data);
////                JSONObject jos = (JSONObject) jas.get(1);
//
//
////            common.token=new StringBuffer(data.toString().split(":")[1].split("\"")[1]);
//
////                common.token=new StringBuffer(jos.optString("token").toString());
//
//            try {
//                JSONArray ja = new JSONArray(data);
//                for (int i =0; i<ja.length();i++){
//                    JSONObject jo = (JSONObject) ja.get(i);
//                    // singleParse = (String) jo.get("name");
////                        complin = (String) jo.get("name");
//
//
//
//
//                    String item =  jo.optString("item").toString();
//
//                    int purchqty = jo.optInt("purchqty");
//
//                    String email = jo.optString("email").toString();
//
//
//                    PurchaseDetails purchaseDetails = new PurchaseDetails(item,purchqty,email);
//
//                    common.purch.add(purchaseDetails);
////                        common.tStatus=status;
//
//                    //+ jo.get("likes") + jo.get("_id");
//                       /* if(jo.get("name").toString().equals(nn) && jo.get("subarea").toString().equals(ac)){
//                            kkk = "true";
//                            iid = (String) jo.get("_id");
//                        }
//
//                        */
//                    // test="no";
//                    dataParse = dataParse  + singleParse;
//                }
//
//
//
//
//            }catch (Exception e){
//
//
//            }
//
//            if(urlConnection.getResponseCode()==200){
//                return "Successful";
//            }else
//                return "Failed";
//
//
//
//
//
//
//
//        } finally {
//            if (bufferedReader != null) {
//                bufferedReader.close();
//            }
//            if (bufferedWriter != null) {
//                bufferedWriter.close();
//            }
//        }
//
//
//    }
//
//}



}
