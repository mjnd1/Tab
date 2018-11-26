# Tab
手机的滑动效果
步骤1.将JitPack存储库添加到构建文件中

将其添加到存储库末尾的根build.gradle中：

allprojects {
	repositories {
		...
		maven { url 'https://www.jitpack.io' }
	}
}
步骤2.添加依赖项

dependencies {
        compile 'com.github.ithuangqing:ItHqSimpleTabLyout:v1.4'
}

使用
添加标签名称
mTitle = ItHqAddTile.addTile("tab1","tab2");
注：可以自由添加任意个页面名称，此方法返回一个列表。

添加片段
 mFragment = ItHqAddFragment.addFragment(new Fragment(),new Fragment2());
注：同样可以添加任意个片段，要与添加的标签数量相同，此方法返回列表。

最后一步，生成标签滑动页面
ItHqAddTab.addTab(mTabLayout,mViewPager,mFragment,mTile,getSupportFragmentManager());
此处注意最后一个参数，我们使用的是V4下的片段。
