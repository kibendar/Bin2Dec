import { PAGES_ROUTES } from "@/shared/lib/constants/pages";
import { LinkLabel } from "../LinkLabel";
import RegistrationButton from "../RegistrationButton";

export function AuthNavigation() {
  return <div className="flex gap-5">
    <div>
      <LinkLabel label={PAGES_ROUTES.LOGIN.label} link={PAGES_ROUTES.LOGIN.path} />  
    </div>
    <div>
      <RegistrationButton />
    </div>
  </div>
}
