#######################################################
#
# Makefile for DDS shapes application.
#
#######################################################

EXECUTABLE = shapes

BASE       = ../../src

RTPS       = ${BASE}/rtps
TRANS      = ${BASE}/trans
DISC       = ${BASE}/disc
CACHE      = ${BASE}/cache
DCPS	   = ${BASE}/dcps
DDS	   = ${BASE}/dds
CO         = ${BASE}/co
DBG        = ${BASE}/dbg
DYNIP      = ${BASE}/dynip
TYPE       = ${BASE}/xtypes
SQL        = ${BASE}/sql
BGNS       = ${BASE}/bgns
SECURITY   = ${BASE}/security
NSEC	   = ${BASE}/nsec

SECP       = ../../plugins/secplug
NSECP      = ../../plugins/nsecplug

dds_CSRCS  = ${DDS}/dds.c ${DDS}/domain.c ${DDS}/locator.c ${DDS}/guid.c \
	     ${DDS}/dds_seq.c ${DDS}/uqos.c ${DDS}/guard.c
type_CSRCS = ${TYPE}/xtypecode.c ${TYPE}/xtypes.c ${TYPE}/xdata.c \
	     ${TYPE}/xcdr.c ${TYPE}/tsm.c ${TYPE}/pl_cdr.c ${TYPE}/pid.c \
	     ${TYPE}/xtopic.c ${TYPE}/vtc.c
dcps_CSRCS = ${DCPS}/dcps_main.c ${DCPS}/dcps_dpfact.c ${DCPS}/dcps_part.c \
	     ${DCPS}/dcps_pub.c ${DCPS}/dcps_sub.c ${DCPS}/dcps_topic.c \
	     ${DCPS}/dcps_reader.c ${DCPS}/dcps_writer.c ${DCPS}/dcps_event.c \
	     ${DCPS}/dcps_waitset.c ${DCPS}/dcps_builtin.c ${DCPS}/dcps_qos.c \
	     ${DCPS}/dcps_entity.c ${DCPS}/dcps_notif.c ${DCPS}/dcps_dbg.c
cache_CSRCS= ${CACHE}/cache.c
disc_CSRCS = ${DISC}/disc_tc.c ${DISC}/disc_sub.c ${DISC}/disc_pub.c \
	     ${DISC}/disc_msg.c ${DISC}/disc_ep.c ${DISC}/disc_match.c \
	     ${DISC}/disc_sedp.c ${DISC}/disc_spdp.c ${DISC}/disc_main.c \
	     ${DISC}/disc_ctt.c ${DISC}/disc_psmp.c \
	     ${DISC}/disc_cdd.c
rtps_CSRCS = ${RTPS}/rtps_main.c ${RTPS}/rtps_mux.c ${RTPS}/rtps_msg.c \
	     ${RTPS}/rtps_slbw.c ${RTPS}/rtps_slbr.c ${RTPS}/rtps_slrw.c \
	     ${RTPS}/rtps_sfbr.c ${RTPS}/rtps_sfbw.c ${RTPS}/rtps_sfrr.c \
	     ${RTPS}/rtps_sfrw.c ${RTPS}/rtps_clist.c ${RTPS}/rtps_frag.c \
	     ${RTPS}/rtps_dbg.c ${RTPS}/rtps_trace.c ${RTPS}/rtps_ft.c \
	     ${RTPS}/rtps_fwd.c
trans_CSRCS= ${TRANS}/ip/rtps_ip.c ${TRANS}/ip/ri_udp.c ${TRANS}/ip/ri_dtls.c \
	     ${TRANS}/ip/ri_tcp.c ${TRANS}/ip/ri_tcp_sock.c ${TRANS}/ip/ri_tls.c \
	     ${TRANS}/ip/ri_bgcp.c
co_CSRCS   = ${CO}/pool.c ${CO}/sys.c ${CO}/error.c ${CO}/ipc.c ${CO}/timer.c \
	     ${CO}/sock.c ${CO}/skiplist.c ${CO}/str.c ${CO}/heap.c ${CO}/md5.c \
	     ${CO}/db.c ${CO}/handle.c ${CO}/tty.c ${CO}/thread.c ${CO}/log.c \
	     ${CO}/hash.c ${CO}/prof.c ${CO}/strseq.c ${CO}/random.c \
	     ${CO}/nmatch.c ${CO}/ipfilter.c ${CO}/libx.c ${CO}/config.c \
	     ${CO}/cmdline.c ${CO}/table.c ${CO}/ctrace.c
#sec_CSRCS  = ${SECURITY}/security.c
sec_CSRCS  = ${NSEC}/sec_main.c ${NSEC}/sec_id.c ${NSEC}/sec_perm.c \
	     ${NSEC}/sec_auth.c ${NSEC}/sec_access.c ${NSEC}/sec_crypto.c \
	     ${NSEC}/sec_cdata.c ${NSEC}/sec_logging.c ${NSEC}/sec_util.c \
	     ${NSEC}/sec_compat.c ${NSEC}/sec_a_std.c  ${NSEC}/sec_p_std.c \
	     ${NSEC}/sec_c_std.c ${NSEC}/sec_a_dtls.c ${NSEC}/sec_p_dtls.c 
#splug_CSRCS= ${SECP}/msecplug.c ${SECP}/xmlparse.c ../security/engine_fs.c
#splug_CSRCS= ../../test/splug/p_main.c ../../test/splug/p_xml.c \
#	     ../security/engine_fs.c
splug_CSRCS= ${NSECP}/sp_auth.c ${NSECP}/sp_crypto.c \
	     ${NSECP}/sp_cert.c ${NSECP}/sp_cred.c \
	     ${NSECP}/sp_sys_cert.c ${NSECP}/sp_sys_crypto.c ${NSECP}/sp_main.c \
	     ${NSECP}/sp_access.c ${NSECP}/sp_xml.c ${NSECP}/sp_access_db.c \
	     ${NSECP}/sp_access_populate.c ${NSECP}/sp_sys_cert_none.c \
	     ${NSECP}/sp_sys.c
sql_CSRCS  = ${SQL}/scan.c ${SQL}/parse.c ${SQL}/bytecode.c
dbg_CSRCS  = ${DBG}/debug.c
dynip_CSRCS= ${DYNIP}/di_main.c ${DYNIP}/di_linux.c
bgns_CSRCS = ${BGNS}/bgns.c

prog_CSRCS = main.c ${dds_CSRCS} ${type_CSRCS} ${dcps_CSRCS} ${disc_CSRCS} \
	     ${cache_CSRCS} ${rtps_CSRCS} ${trans_CSRCS} ${dbg_CSRCS} \
	     ${sql_CSRCS} ${dynip_CSRCS} ${bgns_CSRCS} ${co_CSRCS} ${sec_CSRCS} \
	     ${splug_CSRCS}
prog_COBJS = ${prog_CSRCS:.c=.o}
prog_CHDRS = ${BASE}/include/*.h ../../api/headers/dds/*.h

prog_OBJS  = ${prog_COBJS}

${EXECUTABLE}:	${prog_OBJS}
	gcc -o ${EXECUTABLE} ${prog_OBJS} ${LDFLAGS}

#######################################################
# Setup Compile Environment

CC       = gcc

INC_PATH = -I${BASE}/include -I../../api/headers -I/usr/include/libxml2 -I../../plugins/security/ -I${NSECP}/ -I../../../qeo-c-import/openssl/outputNative/openssl/HOSTLINUX/Debug/src/openssl-1.0.1f/include/
#LIB_PATH =
LIB_PATH = -L../../../qeo-c/output/openssl/HOSTLINUX
LIBS     = 

DEFINES  = -DRTPS_USED -DRTPS_TRACE -DLOG_FILE -DFILT_VMWARE -DPTHREADS_USED \
	   -DCDD_USED -DXTYPES_USED -DDDS_IPV6 -DDDS_DEBUG -DDDS_TYPECODE \
	   -DDDS_DYN_IP -DDDS_TRACE -DRTPS_TRACE -DDDS_TCP -DBIGDATA -DDDS_FORWARD \
	   -DEXTRA_STATS -DUSE_BYTESWAP -DDDS_SECURITY -DMSECPLUG_WITH_SECXML \
	   -DMSG_TRACE -DDDS_NATIVE_SECURITY -DTCP_SUSPEND -DFORCE_MALLOC \
	   -DCTRACE_USED
#-DDS_NO_MCAST
#-DFORCE_MALLOC 
#-DTTY_NORMAL
#-DPROFILE
#-DLOCK_TRACE
#-DLOG_FILE 

OPTTYPE  = 
#-Os

CFLAGS   = -Wall -Wextra -pedantic -Wno-long-long ${OPTTYPE} -g ${INC_PATH} ${DEFINES}
LDFLAGS  = ${LIB_PATH} ${LIBS} -lnsl -lrt -lpthread -lssl -lcrypto -lxml2 -g

all: ${EXECUTABLE}

#######################################################
# Rules for cleaning

clean:
	\rm -f ${prog_OBJS} ${EXECUTABLE} core.*

reallyclean: clean
	\rm -f .shapes_hist .tdds_log_* ${BASE}/*/tags Makefile.bak tags

########################################################

# Object sizes

size:

	size ${prog_OBJS} ${EXECUTABLE}

# coverage

coverage:
	cd ../api/coverage
	lcov -b ../../dcps --directory=../../.. --capture --output-file api.info

# cscope

cscope:
	cscope ${prog_CSRCS}

# Lint (if available)

lint:	${prog_CSRCS}
	\flint std.lnt ${prog_CSRCS}

# Additional dependencies.

depend:
	\makedepend ${INC_PATH} ../*/*.[ch]
