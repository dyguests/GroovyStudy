package com.fanhl.test.t2015.t01.t20150129
/**
 * 此类用于自动转换类型
 * <BR>
 * eg: Convert.from( String ).to( Date ).using { new java.text.SimpleDateFormat('MM-dd-yyyy').parse(value) }<BR>
 *     def christmas = '12-25-2010' as Date
 *
 * Created by fanhl on 15/1/24.
 */
class GroovyConvert {

    private from
    private to

    private GroovyConvert(clazz) { from = clazz }

    static def from(clazz) {
        new GroovyConvert(clazz)
    }

    def to(clazz) {
        to = clazz
        return this
    }

    def using(closure) {
        def originalAsType = from.metaClass.getMetaMethod('asType', [] as Class[])
        from.metaClass.asType = { Class clazz ->
            if (clazz == to) {
                closure.setProperty('value', delegate)
                closure(delegate)
            } else {
                originalAsType.doMethodInvoke(delegate, clazz)
            }
        }
    }
}