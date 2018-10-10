package king.bird.multiplelayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //重试点击事件
        mMultipleLayout.setOnRetryClickListener {
            //模拟网络请求
            Toast.makeText(this@MainActivity,"正在加载。。",Toast.LENGTH_SHORT).show()
        }

        //数据为空
        mBtnNoData.setOnClickListener { mMultipleLayout.showEmpty() }
        //加载失败
        mBtnLoadError.setOnClickListener { mMultipleLayout.showError() }
        //正在加载
        mBtnLoading.setOnClickListener { mMultipleLayout.showLoading() }
        //网络加载失败
        mBtnNetError.setOnClickListener { mMultipleLayout.showNoNetwork() }
        //显示内容
        mBtnShowContent.setOnClickListener { mMultipleLayout.showContent() }

    }
}
