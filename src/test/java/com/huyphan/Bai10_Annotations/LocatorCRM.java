package com.huyphan.Bai10_Annotations;

public class LocatorCRM {



        public static String url = "https://crm.anhtester.com/admin/authentication";

        // Locators for Login Page
        public static String headerLoginPage = "//h1[normalize-space()='Login']";
        public static String inputEmail = "//input[@id='email']";
        public static String inputPass = "//input[@id='password']";
        public static String clickLogin = "//button[normalize-space()='Login']";
        public static String checkboxRememberMe = "//input[@id='remember']";
        public static String labelRememberMe = "//label[@for='remember']";
        public static String linkForgotPassword = "//a[normalize-space()='Forgot Password?']";
        public static String errorMessageInvalidLogin = "//div[contains(@class,'alert-danger')]";
        public static String alertErrorPasswordRequired = "//div[normalize-space()='The Password field is required.']";
        public static String alertErrorEmailRequired = "//div[normalize-space()='The Email Address field is required.']";

        public static void verifyListAlertMessage() {
            String[] alertMessages = {
                    "The Email Address field is required.",
                    "The Password field is required.",
                    "These credentials do not match our records."
            };
            for (String message : alertMessages) {
                System.out.println("Alert message: " + message);
                String alertMessageItem = "//div[normalize-space()='" + message + "']";
                System.out.println("Locator for alert message: " + alertMessageItem);
            }
        }

        //Locators for menu Customer
        public static String menuDashboard = "//span[normalize-space()='Dashboard' and @class='menu-text']";
        public static String menuCustomers = "//span[normalize-space()='Customers' and @class='menu-text']";
        public static String menuProjects = "//span[normalize-space()='Projects' and @class='menu-text']";
        public static String menuTasks = "//span[normalize-space()='Tasks' and @class='menu-text']";
        public static String menuContracts = "//span[normalize-space()='Contracts' and @class='menu-text']";
        public static String menuSales = "//span[normalize-space()='Sales' and @class='menu-text']";
        public static String menuSalesProposals = "//span[normalize-space()='Proposals' and @class='sub-menu-text']";
        public static String menuSalesEstimates = "//span[normalize-space()='Estimates' and @class='sub-menu-text']";
        public static String menuSalesInvoices = "//span[normalize-space()='Invoices' and @class='sub-menu-text']";
        public static String menuSalesPayments = "//span[normalize-space()='Payments' and @class='sub-menu-text']";
        public static String menuSalesCreditNotes = "//span[normalize-space()='Credit Notes' and @class='sub-menu-text']";
        public static String menuSalesItems = "//span[normalize-space()='Items' and @class='sub-menu-text']";
        public static String menuSubscriptions = "//span[normalize-space()='Subscriptions' and @class='menu-text']";
        public static String menuExpenses = "//span[normalize-space()='Expenses' and @class='menu-text']";
        public static String menuSupport = "//span[normalize-space()='Support' and @class='menu-text']";
        public static String menuLeads = "//span[normalize-space()='Leads' and @class='menu-text']";

        //Locators for Customers Summary
        public static String buttonNewCustomer = "//a[normalize-space()='New Customer' and contains(@href,'/clients/client')]";
        public static String buttonImportCustomer = "//a[normalize-space()='Import Customers' and contains(@href,'clients/import')]";
        public static String buttonContacts = "//a[normalize-space()='Contacts' and contains(@href,'all_contacts')]";
        public static String headerCustomerSummary = "//span[normalize-space()='Customers Summary']";
        public static String labelTotalCustomers = "//span[contains(@class,'text-dark tw-truncate sm:tw-text-clip') and normalize-space()='Total Customers']";
        public static String labelNumberTotalCustomers = "//span[normalize-space()='Total Customers']/preceding-sibling::span";
        public static String labelActiveCustomers = "//span[contains(@class,'text-success tw-truncate sm:tw-text-clip') and normalize-space()='Active Customers']";
        public static String searchClients = "//div[@id='clients_filter']//input[@type='search']";
        public static String firstRowItemCustomer = "//table[@id='clients']//tbody//tr[1]//td[3]/a";

        //Locators for new Customer
        public static String inputCompany = "//input[@id='company']";
        public static String inputVatNumber = "//input[@id='vat']";
        public static String inputPhone = "//input[@id='phonenumber']";
        public static String inputWebsite = "//input[@id='website']";
        public static String inputAddress = "//textarea[@id='address']";
        public static String inputCity = "//input[@id='city']";
        public static String inputState = "//input[@id='state']";
        public static String inputZipCode = "//input[@id='zip']";
        public static String dropdownGroups = "//button[@data-id='groups_in[]']";
        public static String inputSearchGroup = "//button[@data-id='groups_in[]']/following-sibling::div//input[@type='search']";
        public static String dropdownCurrency = "//button[contains(@data-id,'default_currency')]";
        public static String inputSearchCurrency = "//button[contains(@data-id,'default_currency')]/following-sibling::div//input[@type='search']";
        public static String dropdownDefaultLanguage = "//button[contains(@data-id,'default_language')]";
        public static String optionLanguage = "//span[normalize-space()='English']";
        public static String optionLanguageDynamic = "//span[normalize-space()='%s']";

        public static String selectXpathLanguage(String language) {
            return String.format("//span[normalize-space()='%s']", language);
        }

        public static String dropdownCountry = "//button[@data-id='country']";
        public static String inputSearchCountry = "//button[@data-id='country']/following-sibling::div//input[@type='search']";
        public static String buttonSaveAndCreateContact = "//button[normalize-space()='Save and create contact']";
        public static String buttonSave = "//button[normalize-space()='Save' and contains(@class,'only-save')]";

        //Locators for menu Projects
        public static String buttonNewProject = "//a[normalize-space()='New Project' and contains(@href,'/projects/project')]";
        public static String buttonGantt = "//a[@data-title='Gantt' and contains(@href,'/projects/gantt')]";
        public static String headerProjectsSummary = "//span[normalize-space()='Projects Summary']";
        public static String labelNotStarted = "//span[normalize-space()='Not Started' and @class='project-status-#475569']";
        public static String labelInProgress = "//span[normalize-space()='In Progress' and @class='project-status-#2563eb']";
        public static String searchProject = "//div[@id='projects_filter']//input[@type='search']";

        //Locators for new Projects
        public static String inputProjectName = "//input[@id='name']";
        public static String dropdownCustomer = "//button[@data-id='clientid']";
        public static String inputSearchCustomer = "//button[@data-id='clientid']/following-sibling::div//input[@type='search']";
        public static String inputProgressFromTasks = "//input[@id='progress_from_tasks']";
        public static String nav = "//input[@id='progress_from_tasks' and @type='checkbox']";
        public static String dropdownBillingType = "//button[@data-id='billing_type']";
        public static String dropdownStatus = "//button[@data-id='status']";
        public static String inputRatePerHour = "//input[@id='project_rate_per_hour']";
        public static String inputEstimatedHours = "//input[@id='estimated_hours']";
        public static String dropdownMembers = "//button[@data-id='project_members[]']";
        public static String inputSearchMembers = "//button[@data-id='project_members[]']/following-sibling::div//input[@type='search']";
        public static String selectAll = "//button[normalize-space()='Select All']";
        public static String seDelectAll = "//button[normalize-space()='Deselect All']";
        public static String inputStartDate = "//input[@id='start_date']";
        public static String inputDeadline = "//input[@id='deadline']";
        public static String inputTags = "//input[@placeholder='Tag']";
        public static String inputDescription = "//div[@role='application']";
        public static String inputSendCreateEmail = "//input[@id='send_created_email']";
        public static String buttonSaveProject = "//button[normalize-space()='Save' and @data-form='#project_form']";

    }


