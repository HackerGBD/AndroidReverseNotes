package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.bkl */
public final class bkl extends btd {
    public int kdT;
    public String kdU;
    public String wNA;
    public C30188he wNB;
    public String wNC;
    public LinkedList<bkm> wNy = new LinkedList();
    public long wNz;

    public bkl() {
        AppMethodBeat.m2504i(56919);
        AppMethodBeat.m2505o(56919);
    }

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(56920);
        C6092b c6092b;
        int ix;
        byte[] bArr;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(56920);
                throw c6092b;
            }
            if (this.BaseResponse != null) {
                c6093a.mo13479iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(c6093a);
            }
            c6093a.mo13480iz(2, this.kdT);
            if (this.kdU != null) {
                c6093a.mo13475e(3, this.kdU);
            }
            c6093a.mo13474e(4, 8, this.wNy);
            c6093a.mo13472ai(5, this.wNz);
            if (this.wNA != null) {
                c6093a.mo13475e(6, this.wNA);
            }
            if (this.wNB != null) {
                c6093a.mo13479iy(7, this.wNB.computeSize());
                this.wNB.writeFields(c6093a);
            }
            if (this.wNC != null) {
                c6093a.mo13475e(8, this.wNC);
            }
            AppMethodBeat.m2505o(56920);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = C6087a.m9557ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix += C6091a.m9572bs(2, this.kdT);
            if (this.kdU != null) {
                ix += C6091a.m9575f(3, this.kdU);
            }
            ix = (ix + C6087a.m9552c(4, 8, this.wNy)) + C6091a.m9578o(5, this.wNz);
            if (this.wNA != null) {
                ix += C6091a.m9575f(6, this.wNA);
            }
            if (this.wNB != null) {
                ix += C6087a.m9557ix(7, this.wNB.computeSize());
            }
            if (this.wNC != null) {
                ix += C6091a.m9575f(8, this.wNC);
            }
            AppMethodBeat.m2505o(56920);
            return ix;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.wNy.clear();
            C6086a c6086a = new C6086a(bArr, unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(56920);
                throw c6092b;
            }
            AppMethodBeat.m2505o(56920);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            bkl bkl = (bkl) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            C6086a c6086a3;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(c6086a3, baseResponse, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        bkl.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.m2505o(56920);
                    return 0;
                case 2:
                    bkl.kdT = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(56920);
                    return 0;
                case 3:
                    bkl.kdU = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(56920);
                    return 0;
                case 4:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bkm bkm = new bkm();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = bkm.populateBuilderWithField(c6086a3, bkm, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        bkl.wNy.add(bkm);
                    }
                    AppMethodBeat.m2505o(56920);
                    return 0;
                case 5:
                    bkl.wNz = c6086a2.BTU.mo13459ve();
                    AppMethodBeat.m2505o(56920);
                    return 0;
                case 6:
                    bkl.wNA = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(56920);
                    return 0;
                case 7:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        C30188he c30188he = new C30188he();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = c30188he.populateBuilderWithField(c6086a3, c30188he, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        bkl.wNB = c30188he;
                    }
                    AppMethodBeat.m2505o(56920);
                    return 0;
                case 8:
                    bkl.wNC = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(56920);
                    return 0;
                default:
                    AppMethodBeat.m2505o(56920);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(56920);
            return -1;
        }
    }
}
