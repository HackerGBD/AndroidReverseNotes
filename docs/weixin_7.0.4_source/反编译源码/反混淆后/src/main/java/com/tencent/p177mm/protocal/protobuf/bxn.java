package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.bxn */
public final class bxn extends bsr {
    public String mZr;
    public int wXy;
    public String wXz;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(28636);
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseRequest != null) {
                c6093a.mo13479iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(c6093a);
            }
            if (this.mZr != null) {
                c6093a.mo13475e(2, this.mZr);
            }
            c6093a.mo13480iz(3, this.wXy);
            if (this.wXz != null) {
                c6093a.mo13475e(4, this.wXz);
            }
            AppMethodBeat.m2505o(28636);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = C6087a.m9557ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.mZr != null) {
                ix += C6091a.m9575f(2, this.mZr);
            }
            ix += C6091a.m9572bs(3, this.wXy);
            if (this.wXz != null) {
                ix += C6091a.m9575f(4, this.wXz);
            }
            AppMethodBeat.m2505o(28636);
            return ix;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(28636);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            bxn bxn = (bxn) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = c6086a2.mo13445Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Vh.get(intValue);
                        C7267hl c7267hl = new C7267hl();
                        C6086a c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = c7267hl.populateBuilderWithField(c6086a3, c7267hl, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        bxn.BaseRequest = c7267hl;
                    }
                    AppMethodBeat.m2505o(28636);
                    return 0;
                case 2:
                    bxn.mZr = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(28636);
                    return 0;
                case 3:
                    bxn.wXy = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(28636);
                    return 0;
                case 4:
                    bxn.wXz = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(28636);
                    return 0;
                default:
                    AppMethodBeat.m2505o(28636);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(28636);
            return -1;
        }
    }
}
