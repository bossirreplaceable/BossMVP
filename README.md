# BossMVP

### 实现步骤：

1.创建View层interface，定义v层实现方法
2.创建Model层interface，定义M层数据获取方法。（内部interface实现数据回调）
3.创建Model层实现数据获取方法的类
4.创建Presenter层类，实现对v层和m层对象的引用，并实现业务逻辑方法。
5.在Presenter类中实现attachView和detachView方法，解决内存泄露问题。
6.实现Presenter和Activity的基类
