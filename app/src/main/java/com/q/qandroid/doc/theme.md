```
主题:
android:theme="@android:style/Theme.Dialog" : Activity显示为对话框模式
android:theme="@android:style/Theme.NoTitleBar" : 不显示应用程序标题栏
android:theme="@android:style/Theme.NoTitleBar.Fullscreen" : 不显示应用程序标题栏，并全屏
android:theme="@android:style/Theme.Light ": 背景为白色
android:theme="@android:style/Theme.Light.NoTitleBar" : 白色背景并无标题栏
android:theme="@android:style/Theme.Light.NoTitleBar.Fullscreen" : 白色背景，无标题栏，全屏
android:theme="@android:style/Theme.Black" : 背景黑色
android:theme="@android:style/Theme.Black.NoTitleBar" : 黑色背景并无标题栏
android:theme="@android:style/Theme.Black.NoTitleBar.Fullscreen" : 黑色背景，无标题栏，全屏
android:theme="@android:style/Theme.Wallpaper" : 用系统桌面为应用程序背景
android:theme="@android:style/Theme.Wallpaper.NoTitleBar" : 用系统桌面为应用程序背景，且无标题栏
android:theme="@android:style/Theme.Wallpaper.NoTitleBar.Fullscreen" : 用系统桌面为应用程序背景，无标题栏，全屏
android:theme="@android:style/Theme.Translucent : 透明背景
android:theme="@android:style/Theme.Translucent.NoTitleBar" : 透明背景并无标题
android:theme="@android:style/Theme.Translucent.NoTitleBar.Fullscreen" : 透明背景并无标题，全屏
android:theme="@android:style/Theme.Panel ": 面板风格显示
android:theme="@android:style/Theme.Light.Panel" : 平板风格显示

Window的属性:
android:windowNoTitle 设置有没有标题栏true|false
android:windowFullScreen 设置全屏true|false
droid:windowIsFloating 设置是否浮现在activity之上true|false
android:windowIsTranslucent 设置window是否为透明
android:windowBackground 设置window的背景颜色
android:windowContentOverlay这个是定义contentoverlay的背景的

TextView的Style:
android:textSize 设置字体大小
android:textColor 设置字体颜色
android:textColorHighlight 被选中文字的底色，默认为蓝色
android:textColorHint 设置提示信息文字的颜色，默认为灰色。与hint一起使用。
android:textColorLink 文字链接的颜色
android:textFilterEnabled 设为真时，列表会过滤根据用户的要求，过滤结果集。列表的适配器必须实现了 Filterable接口，才能使其可用
android:background 设置背景颜色（值可以是图片，也可以是十六进制颜色值）
android:textAppearance 设置文字的外观，如“android:textAppearance=“?android:attr/textAppearanceLargeInverse”这里引用的是系统自带的一个外观
android:textOff 未选中时按钮的文本
android:textOn 选中时按钮的文本
android:textStyle 字体，bold, italic, bolditalic
android:textScaleX控制字与字之间的间距
```