/**************************************************************
 ********          THIS IS A GENERATED FILE         ***********
 **************************************************************/

#define XTYPES_USED
#import <Qeo/dds/dds_tsm.h>
#import "StateWithPrimitivesKeyIsInt64.h"


const DDS_TypeSupport_meta _org_qeo_test_StateWithPrimitivesKeyIsInt64_type[] = {
    { .tc = CDR_TYPECODE_STRUCT, .name = "org.qeo.test.StateWithPrimitivesKeyIsInt64", .flags = TSMFLAG_DYNAMIC|TSMFLAG_GENID|TSMFLAG_KEY|TSMFLAG_MUTABLE, .nelem = 7 },
    { .tc = CDR_TYPECODE_BOOLEAN, .name = "MyBoolean" },
    { .tc = CDR_TYPECODE_OCTET, .name = "MyByte" },
    { .tc = CDR_TYPECODE_SHORT, .name = "MyInt16" },
    { .tc = CDR_TYPECODE_LONG, .name = "MyInt32" },
    { .tc = CDR_TYPECODE_LONGLONG, .name = "MyInt64", .flags = TSMFLAG_KEY },
    { .tc = CDR_TYPECODE_FLOAT, .name = "MyFloat32" },
    { .tc = CDR_TYPECODE_CSTRING, .name = "MyString", .flags = TSMFLAG_DYNAMIC },
};


@implementation org_qeo_test_StateWithPrimitivesKeyIsInt64
{
}

+ (const DDS_TypeSupport_meta *)getMetaType {
    return _org_qeo_test_StateWithPrimitivesKeyIsInt64_type;
}
@end

