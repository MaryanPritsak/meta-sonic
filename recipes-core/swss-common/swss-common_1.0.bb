SUMMARY = "The SWitch State Service (SWSS) common library provides \
           libraries for database communications, netlink wrappers, \
           and other functions needed by SWSS."
SECTION = "libs"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=57f06271d653493cb776b18510c2dd9e"

DEPENDS = "hiredis libnl"

SRC_URI = "git://github.com/Azure/sonic-swss-common.git \
           file://0001-ignore-missing-includes.patch \
"
SRCREV = "447c9a254be7254b7f62987a1d2d5341f27b2ba0"

S = "${WORKDIR}/git"

inherit autotools pkgconfig
