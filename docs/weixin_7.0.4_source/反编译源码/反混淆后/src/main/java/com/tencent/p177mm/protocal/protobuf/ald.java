package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.ald */
public final class ald extends btd {
    public int vEq;
    public int wqC;
    public LinkedList<bfj> wqD = new LinkedList();
    public String wqE;
    public int wqF;

    public ald() {
        AppMethodBeat.m2504i(28450);
        AppMethodBeat.m2505o(28450);
    }

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(28451);
        C6092b c6092b;
        int ix;
        byte[] bArr;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(28451);
                throw c6092b;
            }
            if (this.BaseResponse != null) {
                c6093a.mo13479iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(c6093a);
            }
            c6093a.mo13480iz(2, this.wqC);
            c6093a.mo13474e(3, 8, this.wqD);
            if (this.wqE != null) {
                c6093a.mo13475e(4, this.wqE);
            }
            c6093a.mo13480iz(5, this.vEq);
            c6093a.mo13480iz(6, this.wqF);
            AppMethodBeat.m2505o(28451);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = C6087a.m9557ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix = (ix + C6091a.m9572bs(2, this.wqC)) + C6087a.m9552c(3, 8, this.wqD);
            if (this.wqE != null) {
                ix += C6091a.m9575f(4, this.wqE);
            }
            int bs = (ix + C6091a.m9572bs(5, this.vEq)) + C6091a.m9572bs(6, this.wqF);
            AppMethodBeat.m2505o(28451);
            return bs;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.wqD.clear();
            C6086a c6086a = new C6086a(bArr, unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(28451);
                throw c6092b;
            }
            AppMethodBeat.m2505o(28451);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            ald ald = (ald) objArr[1];
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
                        ald.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.m2505o(28451);
                    return 0;
                case 2:
                    ald.wqC = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(28451);
                    return 0;
                case 3:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bfj bfj = new bfj();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = bfj.populateBuilderWithField(c6086a3, bfj, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        ald.wqD.add(bfj);
                    }
                    AppMethodBeat.m2505o(28451);
                    return 0;
                case 4:
                    ald.wqE = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(28451);
                    return 0;
                case 5:
                    ald.vEq = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(28451);
                    return 0;
                case 6:
                    ald.wqF = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(28451);
                    return 0;
                default:
                    AppMethodBeat.m2505o(28451);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(28451);
            return -1;
        }
    }
}
