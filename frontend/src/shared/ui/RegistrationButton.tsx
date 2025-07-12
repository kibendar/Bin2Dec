import { PAGES_ROUTES } from "../lib/constants/pages";

export default function RegistrationButton() {
  return (
    <button className="border-blue-500 px-10 border-1 rounded text-blue-500 hover:bg-blue-500 hover:text-white transition cursor-pointer"
      onClick={() => window.location.href=`${PAGES_ROUTES.REGISTRATION.path}`}
    >
      {PAGES_ROUTES.REGISTRATION.label}
    </button>
  );
}
