package org.daimhim.gson.plus

import com.google.gson.reflect.TypeToken


/**
 *  author : Zhangx
 *  date : 2021/4/6 15:45
 *  description : json 解析工具
 */
inline fun <reified T> String?.fromJson(): T {
    return JSONUtil.fromJson(this, object : TypeToken<T>() {}.type)
}

fun Any?.toJson(includeNulls: Boolean = true): String {
    return JSONUtil.toJson(this, includeNulls)
}