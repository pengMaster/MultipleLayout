
<h1 align="center">最简单的状态切换布局</h1>

<p align="center">
  <a href="README.md">
    <b>英文说明</b>
  </a>
</p>

### 功能简介

 - 正在加载数据
 - 数据加载失败
 - 数据加载为空
 - 网络加载失败
 - 重试点击事件
 - 支持自定义布局


### 效果图展示
<div >
    <img src="https://github.com/pengMaster/picApplyGit/blob/master/MultipleLayout/device-2018-10-10-104939.png" width="150" height="250"  alt=""/>
    <img src="https://github.com/pengMaster/picApplyGit/blob/master/MultipleLayout/device-2018-10-10-105002.png" width="150" height="250"  alt=""/>
    <img src="https://github.com/pengMaster/picApplyGit/blob/master/MultipleLayout/device-2018-10-10-105048.png" width="150" height="250"  alt=""/>
    <img src="https://github.com/pengMaster/picApplyGit/blob/master/MultipleLayout/device-2018-10-10-105101.png" width="150" height="250" alt=""/>
    <img src="https://github.com/pengMaster/picApplyGit/blob/master/MultipleLayout/device-2018-10-10-105112.png" width="150" height="250"  alt=""/>
   <img src="https://github.com/pengMaster/picApplyGit/blob/master/MultipleLayout/device-2018-10-10-105126.png" width="150" height="250"  alt=""/>
</div>



### 最简单的使用方式

1.Add it in your root build.gradle at the end of repositories:

```java
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

```

2.Add the dependency

```java
	dependencies {
	        implementation 'com.github.pengMaster:MultipleLayout:1.0.0'
	}

```
3.在布局中添加

```java

    <king.bird.multipleview.MultipleLayout
        android:id="@+id/mMultipleLayout"
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <!--任意内容-->
        <TextView
            android:id="@+id/mTvContent"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerInParent="true"
            android:text="@string/content" />

    </king.bird.multipleview.MultipleLayout>


```
```
 注意： MultipleLayout 可做为没有标题栏的最外层布局，内部可包裹任何内容
```

4.代码中使用

```java
        //重试点击事件
        mMultipleLayout.setOnRetryClickListener {
            //模拟网络请求
            Toast.makeText(this@MainActivity,"正在加载。。",Toast.LENGTH_SHORT).show()
        }
        //数据为空
        mMultipleLayout.showEmpty()
        //加载失败
        mMultipleLayout.showError()
        //正在加载
        mMultipleLayout.showLoading()
        //网络加载失败
        mMultipleLayout.showNoNetwork()
        //显示内容
        mMultipleLayout.showContent()


```


### 扩展功能

1.自定义状态布局

```java
    <king.bird.multipleview.MultipleLayout
        android:id="@+id/multipleStatusView"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        <!--自定义布局-->
        app:emptyView="@layout/layout_empty_view"
        app:errorView="@layout/layout_error_view"
        app:loadingView="@layout/layout_loading_view"
        app:noNetworkView="@layout/layout_network_view">

    </king.bird.multipleview.MultipleLayout>
```

2.代码引入布局

```java
        //数据为空
        showEmpty(int layoutId, ViewGroup.LayoutParams layoutParams)
        showEmpty(View view, ViewGroup.LayoutParams layoutParams)
        //加载失败
        showError(int layoutId, ViewGroup.LayoutParams layoutParams)
        showError(View view, ViewGroup.LayoutParams layoutParams)
        //正在加载
        showLoading(int layoutId, ViewGroup.LayoutParams layoutParams)
        showLoading(View view, ViewGroup.LayoutParams layoutParams)
        //网络加载失败
        void showNoNetwork(int layoutId, ViewGroup.LayoutParams layoutParams)
        showNoNetwork(View view, ViewGroup.LayoutParams layoutParams)

```
3.扩展
```
后续添加各种弹框
```

### 参与贡献

1. Fork 本项目
2. 新建 Feat_xxx 分支
3. 提交代码
4. 新建 Pull Request


### github地址

 - 项目地址：https://github.com/pengMaster/MultipleLayout
