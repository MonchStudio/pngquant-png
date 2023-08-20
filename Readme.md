# 项目简介
pngquant-png源码非我所写，来源于github分享https://github.com/qwertme/OpenViewerFX

OpenViewerFX 6.6.14也是最后一个版本包含各类图片处理器，尤其是PNG，我这里只是把png相关代码搬移过来

#压缩算法说明
实现的 pngquant 算法压缩效果不错，不含任何三方依赖几个Java文件而已

# 使用例子
maven 依赖
```xml
<dependency>
    <groupId>com.monchstudio.image</groupId>
    <artifactId>pngquant-png</artifactId>
    <version>1.0.0</version>
</dependency>
```

````java
String srcFile="C:\\Users\\monchstudio\\Desktop\\test\\swagger_logo.png";
String outFile="C:\\Users\\monchstudio\\Desktop\\testout\\swagger_logo.png";
try (FileInputStream fis=new FileInputStream(srcFile);
     FileOutputStream fos=new FileOutputStream(outFile)){
    PngCompressor.compress(fis,fos);
}
````

# LICENSE
Under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation; either
version 2.1
