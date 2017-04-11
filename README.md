# MvpSampleDemo
当使用 Mvp 存在的问题 ，model 可能存在耗时的异步操作，这时由于 activity 和 presenter 关联，persenter 又和 modle 关联，如果这时 acitvity 退出，
而 modle 的耗时操作还没有进行完成，当 modle 结束后，回调的给的 activity 已经不在了 。
