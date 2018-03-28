package io.github.mayubao.android_pay;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import io.github.mayubao.pay_library.AliPayReq2;
import io.github.mayubao.pay_library.PayAPI;

public class PayAliPayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_ali_pay);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        String par ="app_id=2018031902405365&biz_content=%7b%22body%22%3a%22%e4%bd%99%e9%a2%9d%e5%85%85%e5%80%bc%22%2c%22out_trade_no%22%3a%22CM201803280000400004%22%2c%22product_code%22%3a%22QUICK_MSECURITY_PAY%22%2c%22subject%22%3a%22%e4%bd%99%e9%a2%9d%e5%85%85%e5%80%bc%22%2c%22timeout_express%22%3a%2230m%22%2c%22total_amount%22%3a%220.01%22%7d&charset=UTF-8&format=json&method=alipay.trade.app.pay&notify_url=http%3a%2f%2f119.27.170.36%3a805%2fapi%2fservices%2fapp%2fappeal%2fAliPayCallBack&sign_type=RSA2&timestamp=2018-03-28+11%3a36%3a03&version=1.0&sign=UaC1hY1shlcZXysS1K7lYBy3nYQitCwTgCGVj8nLXDatZ26NgbiCE4%2b6dZ3iywuY5j42nTgkojWBH0N4hL8fHfr96PTZggkpwPYox3sApYbA9%2b3rmcXs%2fbd4MM0P2ZkR399WQLRLaFmTOJmG6NNh3CUBSLakecyzm8sRs2A7OGfOVPNPRRqI6VZvBPAlOIJA8KyvNbydqZrjF0Jexeb8bnS%2fr99cQ0aMBS2lN0ngsXDKZSskVmu%2b2MxKT8lOUYvqZP1hYfis0IVXThcjbo%2bgQhff2wBfKUOlvLzKH7ZwFonz2TIK%2fzJzUKnyRQhwNPa3FU8jVk3FEKL2CzHpIcp%2fKw%3d%3d\n";
        AliPayReq2 req2 = new AliPayReq2.Builder()
                .with(this)
                .setSignedAliPayOrderInfo(par)
                .create();
        PayAPI.getInstance().sendPayRequest(req2);
    }

}
